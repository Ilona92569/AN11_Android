package task7;

public class Coffee implements Service {
    private String label;
    private double price;

    public Coffee(final String label, final double price) {
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
