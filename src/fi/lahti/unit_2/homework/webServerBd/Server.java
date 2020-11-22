package fi.lahti.unit_2.homework.webServerBd;


import fi.lahti.unit_2.homework.webServerBd.AuthenticationService;
import fi.lahti.unit_2.homework.webServerBd.ClientHandler;

public interface Server {
    void broadcastMessage(String message);
    boolean isLoggedIn(String nickname);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    AuthenticationService getAuthenticationService();
}
