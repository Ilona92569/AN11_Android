import java.util.Scanner;

public class Third2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i);
            while (!sc.hasNextInt()) {
                System.out.println("Ещё раз");
                sc.next();
            }
            arr[i] = sc.nextInt();
        }
        System.out.println("Второй массив:");
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
            System.out.print(arr2[i] + " ");
        }
    }
}
