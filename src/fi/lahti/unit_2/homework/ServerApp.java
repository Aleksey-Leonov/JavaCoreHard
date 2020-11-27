package fi.lahti.unit_2.homework;

import fi.lahti.unit_2.homework.DB.DbUserService;
import fi.lahti.unit_2.homework.chatServer.ChatServer;


public class ServerApp {
    public static void main(String[] args)
    {
        DbUserService db = new DbUserService();
        System.out.println(db.findUserByEmailPassword("n1@mail.com", "1"));
        new ChatServer();
    }
}
