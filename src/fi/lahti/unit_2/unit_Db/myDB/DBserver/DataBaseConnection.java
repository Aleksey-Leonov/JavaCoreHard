package fi.lahti.unit_db.myDB.DBserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private DataBaseConnection() {}

    public static Connection getConnection(){
        // конфигурирование и подключение к БД
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/webserver?serverTimezone=Europe/Helsinki",
                    "admin",
                    "admin"
            );

        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during establishing DB connection", throwables);
        }
    }

    public static void closs(Connection connection){

        try {
            connection.close();
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during closing DB connection", throwables);
        }
    }
}
