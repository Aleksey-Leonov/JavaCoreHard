package fi.lahti.unit_4.theard;

public class Receiver implements Runnable {
    private Packet packet;

    public Receiver(Packet packet) {
        this.packet = packet;
    }

    @Override
    public void run() {
        for (String str = packet.receive(); !"-EOP".equals(str); str = packet.receive()) {
            System.out.println(String.format("[%s] Message received: %s", Thread.currentThread().getName(), str));
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("EOD reached...");
    }
}
