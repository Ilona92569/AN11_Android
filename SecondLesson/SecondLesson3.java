import java.util.Scanner;

public class SecondLesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        int i = sc.nextInt();
        boolean a = i % 2 == 0;
        System.out.println("Число " + i + " положительно: " + a);
        sc.close();
    }
}
