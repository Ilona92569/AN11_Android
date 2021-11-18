package task1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Utils.enterNumber();
        }
        Thread myThreadMax = new Thread(new MyThreadMax(arr));
        Thread myThreadMin = new Thread(new MyThreadMin(arr));
        myThreadMax.start();
        try {
            myThreadMax.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThreadMin.start();
        try {
            myThreadMin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
