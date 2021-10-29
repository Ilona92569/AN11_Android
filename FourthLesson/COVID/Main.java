package zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test ob =new Test();
        ob.addPatient();
        int pr;
        do {
            System.out.println("Select a tack:");
            System.out.println("1 - Show patient");
            System.out.println("2 - Find out if the patient is sick");
            System.out.println("3 - Find out how much antibody a patient has");
            System.out.println("4 - Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            pr = sc.nextInt();
            switch (pr) {
                case 1:
                    ob.showMasPatients();
                    break;
                case 2:
                    int s = Test.int1();
                    System.out.println("Patient is sick: "+ob.sick(s));
                    break;
                case 3:
                    s = Test.int1();
                    System.out.println("Antibodies: "+ob.antibodies(s));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("There is no such tack number");

            }
        } while (pr != 4);
    }
}
