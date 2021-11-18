package task2;

public class MyThreadMessage implements Runnable {
    public int i;

    public MyThreadMessage(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        if (i % 5 == 0) {
            System.out.println("Прошло 5 секунд");
        }
        if (i % 7 == 0) {
            System.out.println("Прошло 7 секунд");
        }
    }
}
