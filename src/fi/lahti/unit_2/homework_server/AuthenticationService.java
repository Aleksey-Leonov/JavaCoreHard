package fi.lahti.unit_2.homework_server;

import fi.lahti.unit_2.homework_server.DB.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> doAuth(String email, String password);
}
