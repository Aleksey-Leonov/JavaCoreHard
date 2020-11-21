package fi.lahti.unit_1.homework.fruit_apple_orange;

public abstract class Fruit {

    protected int massa;

    public Fruit( int massa) {
        this.massa = massa;

    }

    public int getMassa() {
        return massa;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "massa=" + massa +
                '}';
    }
}
