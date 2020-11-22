package fi.lahti.unit_2.homework;

/*
    1. Добавить в сетевой чат авторизацию через базу данных (SQLite или MySQL или PostgreSQL или H2).
    2.*Добавить в сетевой чат возможность смены ника.

 */

import fi.lahti.unit_2.homework.webServerBd.ChatServer;

public class ServerApp {
    public static void main(String[] args) {
        new ChatServer();
    }
}
