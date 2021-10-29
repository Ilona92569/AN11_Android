import java.util.Scanner;

public class SecondLesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        int i = sc.nextInt();
        if (i >= 0) System.out.println("Число " + i + " положительно: true");
        else System.out.println("Число " + i + " положительно: false");
        sc.close();
    }
}
