package fi.lahti.unit_4.homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Создать три потока, каждый из которых выводит определенную букву (A, B и C)
    5 раз (порядок – ABСABСABС). Используйте wait/notify/notifyAll.
*/

public class WorkMain {
    public static void main(String[] args) {

        Sinhronaizer sinhron = new Sinhronaizer(); // МЕТОД ОЧЕРЕДНОСТИ ДОСТУПА К  ИНФОРМАЦИИ
        Transmitter transmitter = new Transmitter(sinhron); // ДАННЫЕ
        Receiver receiver = new Receiver(sinhron); // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ
        Receiver receiver1 = new Receiver(sinhron); // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ

         ExecutorService executorService = Executors.newFixedThreadPool(3);

         for(int i = 0; i < 5; i++) {
             executorService.submit(transmitter); // ДАННЫЕ
             executorService.submit(receiver);   // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ
             executorService.submit(receiver1);  // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ
         }

          /*
        new Thread(transmitter).start();  // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ
        new Thread(receiver).start();  // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ
        new Thread(receiver1).start();  // ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ


           */

        executorService.shutdown();
    }
}
