package task7;

public class OptionDecorator implements Service {
    private Service service;
    private String label;
    private double price;

    public OptionDecorator(final Service service, final String label, final double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    @Override
    public String getLabel() {
        return this.label + service.getLabel();
    }

    @Override
    public double getPrice() {
        return this.price + service.getPrice();
    }
}
