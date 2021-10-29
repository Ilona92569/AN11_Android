import java.util.Scanner;

public class Third10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String z;
        do {
            System.out.println("Введите операцию: ");
            z = sc.nextLine();
        } while (z.length() < 1);
        System.out.println("Введите первое число");
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        System.out.println("Введите второе число");
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int x = sc.nextInt();
        switch (z) {
            case "+":
                int sum = n + x;
                System.out.println("Сумма чисел: " + sum);
                break;
            case "-":
                double raz = (double) n - (double) x;
                System.out.println("Разница чисел: " + raz);
                break;
            case "*":
                double ym = n * x;
                System.out.println("Умножение чисел: " + ym);
                break;
            case "/":
                if (x == 0) {
                    System.out.println("Деление на ноль невозможно. Введите занаво второе число: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ещё раз");
                        sc.next();
                    }
                    x = sc.nextInt();
                }
                double del = (double) n / (double) x;
                System.out.println("Деление чисел: " + del);
                break;
            default:
                System.out.println("Вы ввели оперцию, которой нету)");
        }
    }
}
