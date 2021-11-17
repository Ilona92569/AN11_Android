package task7;

public class Main {
    public static void main(String[] args) {
        Service coffee = new Coffee("Coffee",75);
        Service milk = new Milk(coffee);
        Service cinnamon = new Cinnamon(milk);
        System.out.println(cinnamon.getLabel());
        System.out.println(cinnamon.getPrice());

        Service cappuccino = new Cappuccino("Cappuccino", 70);
        Service syrup = new Syrup(cappuccino);
        System.out.println(syrup.getLabel());
        System.out.println(syrup.getPrice());
    }
}
