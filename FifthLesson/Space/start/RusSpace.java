package start;

public class RusSpace implements IStart{
    public boolean systemCheck() {
        int check = (int) (Math.random() * 5);
        return check >= 2;
    }
    public void engineStarting() {
        System.out.println("RUSspace engines started.");
        System.out.println("All systems are OK");
    }

    public void start() {
        System.out.println("RUSspace start");
    }
}
