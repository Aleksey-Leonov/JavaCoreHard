package fi.lahti.unit_2.homework.webServerBd;




import fi.lahti.unit_2.homework.webServerBd.BD.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> findUserByEmailPassword(String email, String password);
}
