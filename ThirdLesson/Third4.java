public class Third4 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 4, 9, 1, 1};
        int a;
        for (int i = 0; i <= arr.length / 2; i++) {
            a = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
