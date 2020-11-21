package fi.lahti.unit_2.webServerDb;



import java.util.Optional;

public interface AuthenticationService {
    Optional<User> doAuth(String login, String password);
}
