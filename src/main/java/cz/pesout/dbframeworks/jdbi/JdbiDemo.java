package cz.pesout.dbframeworks.jdbi;

import cz.pesout.dbframeworks.data.CountryRecord;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;

import java.util.ResourceBundle;

public class JdbiDemo {
    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("application");

        String jdbcUrl = rb.getString("db.jdbcUrl");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");

        Jdbi jdbi = Jdbi.create(jdbcUrl, username, password);
        try (Handle handle = jdbi.open()) {

            Query query = handle.createQuery("select * from Country where Population > :population order by Code");
            query.bind("population", 1_000_000);

            var result = query.map((rs, ctx) -> new CountryRecord(
                    rs.getString("code"),
                    rs.getString("name"),
                    rs.getInt("population")))
                    .list();
            for(var rs : result) {
                System.out.printf("%s - %s, %d%n", rs.code(), rs.name(), rs.population());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
