import java.io.Serializable;

public class Auto implements Serializable {
    public String brand;
    public int speed, price;

    public Auto(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
