package fi.lahti.unit_5.homework;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GasPool {

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

     //количество топлива в баке
    private float GasPoolCapacity = 500F;

    public float getGasPoolCapacity() {
        return GasPoolCapacity;
    }


      //  2. GasPool потоко небезопасный. Несколько потоков одновременно зайдут с сломают значение.


    // баллон с топливом
    public float gasPoolReqest(float amount){
        lock.writeLock().lock();
        try {

            if(amount > GasPoolCapacity){
                System.out.println(" MSD -> GasPool: Топливо закончилось.....");
                return 0F;
            }

            GasPoolCapacity -= amount;
            Thread.sleep(100);
            return amount;

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
        lock.writeLock().unlock();
    }

        return 0F;
    }



}
