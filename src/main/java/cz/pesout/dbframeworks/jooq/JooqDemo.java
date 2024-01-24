package cz.pesout.dbframeworks.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import static cz.pesout.dbframeworks.jooq.generated.Tables.COUNTRY;

public class JooqDemo {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("application");

        String jdbcUrl = rb.getString("db.jdbcUrl");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Result<Record> result = create
                    .select()
                    .from(COUNTRY)
                    .where(COUNTRY.POPULATION.gt(1_000_000))
                    .orderBy(COUNTRY.CODE)
                    .fetch();

            for (Record rs : result) {
                System.out.printf("%s - %s, %d%n",
                        rs.getValue(COUNTRY.CODE),
                        rs.getValue(COUNTRY.NAME),
                        rs.getValue(COUNTRY.POPULATION));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
