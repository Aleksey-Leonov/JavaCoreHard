package homework_server;

import homework_server.DB.DBService;
import homework_server.DB.User;

import java.util.Optional;

public class BasicAuthenticationService implements AuthenticationService{

     // ГЛАВНЫЙ ПРИ ИНИЦИАЛИЗАЦИИ КЛИЕНТОВ


    public Optional<User> doAuth(String email, String password) {
        DBService dbService = new DBService();
        User newUser = dbService.findUser(email);

        if (newUser.getPassword().equals(password)) {
            return Optional.of(newUser);
        }

        return Optional.empty();
    }
}
