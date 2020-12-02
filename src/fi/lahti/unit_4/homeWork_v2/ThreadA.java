package fi.lahti.unit_4.homeWork_v2;

public class ThreadA extends Thread implements Runnable{

    public ThreadA(SinhronaizerManager manager) {
        super(manager);
    }

    @Override
    public void run() {
        while (counter > 0) {
            manager.showA();
            counter--;
        }
    }
}
