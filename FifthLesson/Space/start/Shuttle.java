package start;

public class Shuttle implements IStart {
    public boolean systemCheck() {
        int check = (int) (Math.random() * 11);
        return check >= 3;
    }

    public void engineStarting() {
        System.out.println("Shuttle engines started.");
        System.out.println("All systems are OK");
    }

    public void start() {
        System.out.println("Shuttle start");
    }


}
