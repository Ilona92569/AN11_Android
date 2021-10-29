import java.util.Scanner;

public class SecondLesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        int i = sc.nextInt();
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        int j = sc.nextInt();
        if (i > j) System.out.println(i);
        else System.out.println(j);
        sc.close();
    }
}
