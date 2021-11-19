package task7;

public class Milk extends OptionDecorator {
    public Milk(Service service) {
        super(service, " Milk ", 10);
    }
}
