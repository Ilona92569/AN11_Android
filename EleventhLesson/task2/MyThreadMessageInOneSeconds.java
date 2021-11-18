package task2;

public class MyThreadMessageInOneSeconds implements Runnable {
    public String message;

    public MyThreadMessageInOneSeconds(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
