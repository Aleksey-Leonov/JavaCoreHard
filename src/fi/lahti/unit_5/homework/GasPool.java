package fi.lahti.unit_5.homework;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GasPool {

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

     //количество топлива в заправочной цистерне
    private float GasPoolCapacity = 200F;

    public float getGasPoolCapacity() {
        return GasPoolCapacity;
    }


      //  2. GasPool потоко небезопасный. Несколько потоков одновременно зайдут с сломают значение.


    public float requestFuel(float fuelAmount) {
        lock.writeLock().lock();

        if(fuelAmount > GasPoolCapacity){
            System.out.println("На станции нет  в наличие столько топлива.....");
            return 0F;
        }

        GasPoolCapacity -= fuelAmount;
        lock.writeLock().unlock();
        return fuelAmount;
    }

    // баллон с топливом
   public void info (){

        lock.writeLock().lock();
        System.out.println("Остаток топлива на станции " + GasPoolCapacity );
        lock.writeLock().unlock();


    }

}
