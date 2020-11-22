package fi.lahti.unit_2.bd;

public class Main {
    public static void main(String[] args) {
        FruitService fruitService = new FruitService();
//        Fruit apple = new Fruit(0, "Apple");
//        fruitService.save(apple);
        System.out.println(fruitService.findById(1));
        System.out.println(fruitService.findAll());

    }
}
