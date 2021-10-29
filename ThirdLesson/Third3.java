public class Third3 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 4, 9, 1, 1};
        int min = arr[1];
        int[] index = new int[7];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                index[k] = i;
                k++;
            }
        }
        System.out.println("Минимальнный элемент: " + min);
        System.out.println("Индекс: ");
        for (int i = 0; i < k; i++) {
            System.out.print(index[i] + " ");
        }
    }
}
