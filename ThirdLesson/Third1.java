import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Third1 {
    public static void main(String[] args) {
        System.out.println("Введите размерность");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        System.out.println("Введите значение");
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            System.out.print(arr[i] + " ");
        }
    }
}
