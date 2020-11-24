package fi.lahti.unit_2.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1:39:46

public class DBService {
    private DBService() {}

    // конфигурирование драйвера
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/warehouse?serverTimezone=Europe/Helsinki",
                    "root",
                    ""
            );
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during establishing DB connection", throwables);
        }
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during connection close", throwables);
        }
    }

    public static void rollback(Connection connection) {
        try {
            connection.rollback();
        } catch (SQLException e) {
            throw new RuntimeException("SWW during rollback", e);
        }
    }
}
