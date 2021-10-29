public class Third6 {
    public static void main(String[] args) {
        int[] arr = {0, -45, 84, 2, -65, 55, 45, 2, 4, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i]);
        }
        System.out.println("Сумма: " + sum);
    }
}
