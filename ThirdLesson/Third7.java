import java.util.Scanner;

public class Third7 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        int[] arr = new int[15];
        int k = 0;
        for (int i = 0; i < 15; i++) {
            if (n != 0) {
                arr[i] = n % 10;
                n = n / 10;
                k++;
            }
        }
        System.out.print("Числа: " + arr[k - 1]);
        for (int i = k - 2; i >= 0; i--) {
            System.out.print(", " + arr[i]);
        }
        int max = arr[0];
        for (int i = 0; i < k; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Максимальное число: " + max);
    }
}
