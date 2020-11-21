package fi.lahti.unit_1.homework.fruit_apple_orange;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements IBox<T> {

private List<T>fruits;

    public Box() {
        fruits = new ArrayList<>();
    }


    @Override
    public void add(T fruit) {
        fruits.add(fruit);
    }

    // переложить фрукты в другой ящик
    public void moveTo(Box<T> otherBox) {
        fruits.forEach(fruit -> otherBox.add(fruit));
    }

    // высчитывает вес коробки
    @Override
    public int getWeight() {
        int massa = 0;
        for (Fruit f: fruits) {
            massa += f.getMassa();
        }
      return massa;
    }

    @Override
    public boolean compare(Box<? extends Fruit> otherBox) {
        return otherBox.getWeight() == getWeight();
    }

}
