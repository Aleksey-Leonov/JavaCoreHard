package fi.lahti.unit_4.homeWork_v2;

public abstract class Thread {
    protected String nime;
    protected SinhronaizerManager manager;
    protected int counter = 5;


    public Thread(SinhronaizerManager manager) {
        this.manager = manager;
    }


}

