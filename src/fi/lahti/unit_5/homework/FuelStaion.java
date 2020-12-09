package fi.lahti.unit_5.homework;

/*
    FuelStaion одновременно может заправлять только 3 автомобиля, остальные должны пока не освободится место (порядок не имеет значения).
	При заправке автомобиля запрашивается необходимое количество топливо, которое поступает из GasPool.
	Необходимое топливо для автомобиля вычисляется на основании формулы R = C - F, где С это объем бака, а F - фактическое состояние бака
	Заправка занимает 5 сек, зачем транспортное средство освобождает место
 */

import java.util.concurrent.Semaphore;

public class FuelStaion {

    private Semaphore semaphore;
    private GasPool gasPool;


    public FuelStaion(Semaphore semaphore, GasPool gasPool) {
        this.gasPool = gasPool;
        this.semaphore = semaphore;

    }


    // заправочная станция
    public float fuelStantionDoRefuel(float amount){
            float W = 0;
        try {
            semaphore.acquire();
            W = gasPool.gasPoolReqest(amount); // подключение к баллону с топливом

            System.out.println(" MSD-> FuelStaion: идёт заправка ") ;
            Thread.sleep(5000);


            if(gasPool.getGasPoolCapacity() == 0) {
                System.out.println("MSD-> FuelStaion: На станции закончился бензин ");
                return 0;
            }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release(); // отключение баллона с топливом
                System.out.println("MSD-> FuelStaion: FREE (колонко свободная) , на станции осталось топлива " + gasPool.getGasPoolCapacity() + " L");
            }

        return W;
    }

}
