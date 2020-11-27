package fi.lahti.unit_2.homework.DB;

import java.util.Optional;

public interface AuthenticationService {
    Optional <User> findUserByEmailPassword(String email, String password);
}
