package fi.lahti.unit_2.homework.webServerBd.BD;


import fi.lahti.unit_2.homework.webServerBd.AuthenticationService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Input credentials sample
 * "-auth n1@mail.com 1"
 */

public class DbUserService implements AuthenticationService {
        // подключение к БД

    public Optional<User> findUserByEmailPassword(String email, String password){
        //выполнение запроса
        Connection connection = DataBaseConnection.getConnection();
        try {
            //получение данных
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE email = ? AND password = ?"
            );
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();

            if(rs.next()){
                      new User(
                              //rs.getInt("id"),
                               rs.getString("nickname"),
                               rs.getString("email"),
                               rs.getString("password")

               );
            }
            return Optional.empty();

        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during user all", throwables);
        }

    }
}
