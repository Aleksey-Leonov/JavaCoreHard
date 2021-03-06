package fi.lahti.unit_db.myDB.DBserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;



public class DbUserService  {

    ArrayList<User> dbUser = new ArrayList<>();

        // подключение к БД

    public Optional <User> findUserByEmailPassword(String email, String password){
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
                dbUser.add(new User(
                               rs.getString("nickname"),
                               rs.getString("email"),
                               rs.getString("password")
                )
               );
            }

            for(User t:dbUser) {
                System.out.println(t);
            }

            return Optional.empty();

        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during user all", throwables);
        }

    }


}
