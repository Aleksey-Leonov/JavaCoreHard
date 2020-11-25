package fi.lahti.unit_2.homework.webServerBd;

import fi.lahti.unit_2.myDB.DataBaseService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class DbAuthenticationService implements AuthenticationService {

    Collection<User> dBusers;

    public Collection<User>findAll() {

        Connection connection = DataBaseService.getConnection();

        try {

            //выполнение запроса
            Statement statement = connection.createStatement();
            //  statement.executeQuery получение данных
            ResultSet resultSet = statement.executeQuery("SELECT * FROM  myusers");

            dBusers = new ArrayList<>();

            while (resultSet.next()) {
                dBusers.add(
                        new User(
                                resultSet.getInt("id"),
                                resultSet.getString("nickname"),
                                resultSet.getString("email"),
                                resultSet.getString("password")

                        )
                );
            }
            return dBusers;

        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during user all", throwables);
        }
    }


    public Optional<User> doAuth(String login, String password) {
        for (User user : dBusers) {
            if (user.getEmail().equals(login) && user.getPassword().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

}
