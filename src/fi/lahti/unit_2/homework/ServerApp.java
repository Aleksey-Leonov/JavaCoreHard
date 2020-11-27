package fi.lahti.unit_2.homework;


/*
    1. Добавить в сетевой чат авторизацию через базу данных (SQLite или MySQL или PostgreSQL или H2).
    2.*Добавить в сетевой чат возможность смены ника.

 */

/*
1. Создать логгер локальной истории в текстовый файл. Считываем данные введенные из консоли и добавляем в файл с новой строки.
2. После загрузки клиента показывать ему последние 100 строк чата.
3. * Не использовать сканер в процессе считывания данных из консоли

 */

import fi.lahti.unit_2.homework.webServerBd.ChatServer;

public class ServerApp {
    public static void main(String[] args) {

        new ChatServer();

    }
}
