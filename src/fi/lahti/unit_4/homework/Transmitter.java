package fi.lahti.unit_4.homework;

// ДАННЫЕ
public class Transmitter implements Runnable {
    private Sinhronaizer sinhronaizer;
    private String[] data;

    public Transmitter(Sinhronaizer packet) {
        this.sinhronaizer = packet;
        data = new String[]{
                "A",
                "B",
                "C",
                "exit",
                "exit"


        };
    }

    @Override
    public void run() {
        for (String d : data) {
            sinhronaizer.transmit(d);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
