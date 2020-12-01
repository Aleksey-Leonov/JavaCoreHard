package fi.lahti.unit_4.homework;


// ПОЛУЧАТЕЛЬ ИНФОРМАЦИИ

public class Receiver implements Runnable {
    private Sinhronaizer packet;
    String str;

    public Receiver(Sinhronaizer packet) {
        this.packet = packet;
    }

    @Override
    public void run() {

        for (str = packet.receive(); !"exit".equals(str); str = packet.receive()) {
            System.out.println(String.format("[%s] Message received (Сообщение получено) : %s", Thread.currentThread().getName(), str));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("EOD reached...");
    }
}
