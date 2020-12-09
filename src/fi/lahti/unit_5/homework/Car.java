package fi.lahti.unit_5.homework;

public class Car extends Transport {

    public Car(String name, float sizeC, float consuption, float capasityF, FuelStaion fuelStaion) {
        super(name, sizeC, consuption, capasityF, fuelStaion);
    }

    public void carDrive(){
        // System.out.println(name + " Едит ... ");
        try {
            while (capasityF > 2.5) {
                Thread.sleep(3000);
                capasityF -= consuption;
                 System.out.println("MSD -> " + name + " топливо в баке ... "  + capasityF);
            }



            // Вычисляем расход
            refuel = sizeC - capasityF;
           // System.out.println("MSD -> Было израсходовано " + refuel);

            float R = fuelStaion.fuelStantionDoRefuel(refuel); // заправка на заправочной станции

            //заправляем не достающий объем
            capasityF += R;

            System.out.println("MSD -> " +  name +  " заправлено " + R + " Количество топлива " + capasityF);

            if(capasityF < 1F || capasityF > -1F) {
                System.out.println( " ТОПЛИВО ЗАКОНЧИЛОСЬ!  ... " + name );
                return;
            }
            carDrive();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
    @Override
    public void run() {
        carDrive();
    }
}
