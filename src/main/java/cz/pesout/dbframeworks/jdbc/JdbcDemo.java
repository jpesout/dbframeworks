package cz.pesout.dbframeworks.jdbc;

import java.sql.*;
import java.util.ResourceBundle;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        ResourceBundle rb = ResourceBundle.getBundle("application");

        String jdbcUrl = rb.getString("db.jdbcUrl");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String query = "SELECT * FROM country WHERE Population > ? ORDER BY code";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, 1_000_000);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.printf("%s - %s, %d%n",
                        rs.getString("Code"),
                        rs.getString("Name"),
                        rs.getInt("Population"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
