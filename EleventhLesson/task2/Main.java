package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time;
        do {
            System.out.println("Введите время в секундах");
            while (!sc.hasNextInt()) {
                System.out.println("Ещё раз");
                sc.next();
            }
            time = sc.nextInt();
        } while (time < 1);
        Thread thread = new Thread(new MyThreadChronometer(time));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
