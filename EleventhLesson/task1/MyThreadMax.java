package task1;

public class MyThreadMax implements Runnable {
    int[] arr;

    public MyThreadMax(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
}
