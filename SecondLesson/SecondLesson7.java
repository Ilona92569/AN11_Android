import java.util.Scanner;

public class SecondLesson7 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Единиц: " + a % 10);
        a /= 10;
        System.out.println("Десятков: " + a % 10);
        a /= 10;
        System.out.println("Сотен: " + a % 10);
        a /= 10;

    }
}
