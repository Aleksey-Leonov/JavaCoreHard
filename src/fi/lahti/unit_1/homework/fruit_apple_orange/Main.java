package fi.lahti.unit_1.homework.fruit_apple_orange;

public class Main {

    public static void main(String[] args) {

       Fruit apple = new Apples(20, 2);
       Fruit orangee = new Oranges(30, 2);
       Kivi omena = new Kivi(3, 10);


       IBox box = new Box();
       box.add(apple);
       box.add(orangee);
       box.add(omena);

       System.out.println("BoxMass " +box.getWeightBox());

    }
}
