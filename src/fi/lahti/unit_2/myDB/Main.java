package fi.lahti.unit_2.myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        // конфигурирование и подключение к БД
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse?serverTimezone=Europe/Helsinki",
                    "admin",
                    "admin"
            );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
