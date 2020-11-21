package fi.lahti.unit_2.webServerDb;



public interface Server {
    void broadcastMessage(String message);
    boolean isLoggedIn(String nickname);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    AuthenticationService getAuthenticationService();
}
