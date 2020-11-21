package fi.lahti.unit_1.homework.fruit_apple_orange;

public class Main {

    public static void main(String[] args) {
       Fruit apple = new Apples(40);
       Fruit orangee = new Oranges(30);
       Omena omena = new Omena(90);

       IBox box = new Box();
       box.add(apple);
       box.add(orangee);

       box.add(omena);

       System.out.println(box.getWeight());
    }
}
