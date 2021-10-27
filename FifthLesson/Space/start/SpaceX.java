package start;

public class SpaceX implements IStart {
    public boolean systemCheck() {
        int check = (int) (Math.random() * 100);
        return check >= 50;
    }
    public void engineStarting() {
        System.out.println("SpaceX engines started.");
        System.out.println("All systems are OK");
    }

    public void start() {
        System.out.println("SpaceX start");
    }
}
