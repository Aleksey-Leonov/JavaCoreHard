package fi.lahti.unit_2.homework.webServerBd;



import homework.webServerBd.BD.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> findUserByEmailPassword(String email, String password);
}
