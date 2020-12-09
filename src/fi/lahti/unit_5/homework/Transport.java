package fi.lahti.unit_5.homework;

public abstract class Transport implements Runnable{

    protected String name;

    // это объем бака
    protected float sizeC;

    // расход топливо
    protected float consuption;

    //F - фактическое состояние бака
    protected float capasityF;

    protected FuelStaion fuelStaion;

    protected float refuel;


    public Transport(String name, float sizeC, float consuption, float capasityF, FuelStaion fuelStaion) {
        this.name = name;
        this.fuelStaion = fuelStaion;
        this.sizeC = sizeC;
        this.consuption = consuption;
        this.capasityF = capasityF;
    }


}
