package fi.lahti.unit_4.homeWork;

public class ThreadC extends Thread implements Runnable {

    public ThreadC(SinhronaizerManager manager) {
        super(manager);
    }

    @Override
    public void run() {
        while (counter > 0) {
            manager.showC();
            counter--;
        }
    }
}
