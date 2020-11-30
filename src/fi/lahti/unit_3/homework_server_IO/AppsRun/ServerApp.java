package fi.lahti.unit_3.homework_server_IO.AppsRun;
import fi.lahti.unit_3.homework_server_IO.ChatServer;

/*
    1. Создать логгер локальной истории в текстовый файл. Считываем данные введенные из консоли и добавляем в файл с новой строки.
    2. После загрузки клиента показывать ему последние 100 строк чата.
    3. * Не использовать сканер в процессе считывания данных из консоли
 */

public class ServerApp {

    public static void main(String[] args) {
        new ChatServer();
  }

}
