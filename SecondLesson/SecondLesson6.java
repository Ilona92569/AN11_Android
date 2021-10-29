import java.util.Scanner;

public class SecondLesson6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        a = sc.nextInt();
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        b = sc.nextInt();
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        c = sc.nextInt();
        if (a > b + c || b > a + c || c > a + b) System.out.println("Плохой треугольник");
        else System.out.println("good треугольник");
    }
}
