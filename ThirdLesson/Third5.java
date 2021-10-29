public class Third5 {
    public static void main(String[] args) {
        int[] arr = {0, 456, 84, 2, 65, 55, 45, 2, 4, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма чётных: " + sum);
    }
}
