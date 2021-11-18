package task2;

public class MyThreadChronometer implements Runnable {
    int time;

    public MyThreadChronometer(int time) {
        this.time = time;
    }

    @Override
    public synchronized void run() {
        for (int i = 1; i < time; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread myThreadMessageInOneSeconds = new Thread(new MyThreadMessageInOneSeconds("Осталось " + (time - i) + " секунд"));
            myThreadMessageInOneSeconds.start();
            Thread myThreadMessage = new Thread(new MyThreadMessage(i));
            myThreadMessage.start();
        }
    }
}
