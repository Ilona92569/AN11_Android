import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;


    public Car(final String brand, final int speed, final int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws StartException {
        Random randoms = new Random();
        int random;
        do {
            random = randoms.nextInt(21);
        } while (random == 0);
        if (random % 2 == 0) {
            final StartException exception = new StartException();
            throw exception;
        } else {
            System.out.println("The car went");
        }
    }
}
