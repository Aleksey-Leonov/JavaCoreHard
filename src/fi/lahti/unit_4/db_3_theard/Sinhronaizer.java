package fi.lahti.unit_4.db_3_theard;

// class ОЧЕРЕДНОСТИ ДОСТУПА К ИНФОРМАЦИИ
public class Sinhronaizer {
    private String data;
    private boolean isTransfer = true;


    public synchronized void transmit(String data) {
        System.out.println(String.format("[%s] Transmit preparation (Подготовка к передаче)...", Thread.currentThread().getName()));
        while (!isTransfer) {
            try {
                System.out.println((String.format("[%s] Waiting for a free window (Жду свободного окна)...", Thread.currentThread().getName())));
                wait();
                } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("SWW since thread was interrupted");
            }
        }

        isTransfer = false;
        this.data = data;
        notify();

        System.out.println((String.format("[%s] Data prepared to transmit (Данные готовы к передаче) ...", Thread.currentThread().getName())));

    }

    public synchronized String receive() {

        while (isTransfer) {
            try {
                System.out.println((String.format("[%s] Waiting for data to be received (Ожидание получения данных)...", Thread.currentThread().getName())));
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("SWW since thread was interrupted");
            }
        }

        isTransfer = true;

        notify();
        System.out.println((String.format("[%s] Data successfully received (Данные успешно получены)...", Thread.currentThread().getName())));

        return data;
    }

}