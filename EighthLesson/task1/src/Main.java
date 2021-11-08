public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 220, 5000);
        Car ferrari = new Car("Ferrari", 300, 1000000);
        Car ford = new Car("Ford Mustang", 290, 999999);
        try {
            audi.start();
        } catch (StartException ex) {
            ex.printStackTrace();
        }
        try {
            ferrari.start();
        } catch (StartException e) {
            e.printStackTrace();
        }
        try {
            ford.start();
        } catch (StartException e) {
            e.printStackTrace();
        }
    }
}
