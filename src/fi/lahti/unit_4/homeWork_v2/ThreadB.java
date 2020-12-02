package fi.lahti.unit_4.homeWork_v2;

public class ThreadB extends Thread implements Runnable{


    public ThreadB(SinhronaizerManager manager) {
        super(manager);
    }

    @Override
    public void run() {
        while (counter > 0) {
            manager.showB();
            counter--;
        }
    }
}
