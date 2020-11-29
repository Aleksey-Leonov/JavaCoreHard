package homework_server;

import homework_server.DB.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> doAuth(String email, String password);
}
