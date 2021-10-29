import java.util.Scanner;

public class Third9 {
    public static void main(String[] args) {
        System.out.println("Введите размерность");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        System.out.println("Введите размерность");
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int x = sc.nextInt();
        int[][] arr = new int[n][x];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("arr[" + i + "][" + j + "]= ");
                while (!sc.hasNextInt()) {
                    System.out.println("Ещё раз");
                    sc.next();
                }
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr2 = new int[x][n];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
