package task1;

import java.util.Scanner;

public class Utils {
    public static int enterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number;
        while (!sc.hasNextInt()){
            System.out.println("Again");
            sc.next();
        }
        number = sc.nextInt();
        return number;
    }
}
