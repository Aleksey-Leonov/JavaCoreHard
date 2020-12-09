package fi.lahti.unit_5.homework;

public class Bus extends Transport {

    public Bus(String name, float sizeC, float consuption, float capasityF, FuelStaion fuelStaion) {
        super(name, sizeC, consuption, capasityF, fuelStaion);
    }

    public void busDrive(){
       // System.out.println(name + " Едит ... ");
        try {
            while (capasityF > 7.5F) {
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

            if(capasityF < 3F ) {
                System.out.println( " ТОПЛИВО ЗАКОНЧИЛОСЬ!  ... " + name);
                return;
            }

            busDrive();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void run() {
        busDrive();

    }
}
