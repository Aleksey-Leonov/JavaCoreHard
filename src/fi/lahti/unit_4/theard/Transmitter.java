package fi.lahti.unit_4.theard;

public class Transmitter implements Runnable {
    private Packet packet;
    private String[] data;

    public Transmitter(Packet packet) {
        this.packet = packet;
        data = new String[]{
                "Hello, world",
                "My name is Maks",
                "I am 55 years old",
                "-EOP"
        };
    }

    @Override
    public void run() {
        for (String d : data) {
            packet.transmit(d);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
