package task7;

public class Cappuccino implements Service {
    private String label;
    private double price;

    public Cappuccino(final String label, final double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
