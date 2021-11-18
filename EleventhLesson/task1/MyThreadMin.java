package task1;

public class MyThreadMin implements Runnable {
    int[] arr;

    public MyThreadMin(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
