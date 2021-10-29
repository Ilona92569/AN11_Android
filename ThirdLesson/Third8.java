import java.util.Scanner;

public class Third8 {
    public static void main(String[] args) {
        System.out.println("Введите размерность");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        int k = n;
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[k];
            k--;
        }
        k = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = 1;
            }
            k--;
        }
        k = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            k--;
        }
    }
}
