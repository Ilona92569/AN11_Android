package task3;

import java.util.Scanner;

public class Utils {
    public static int numberPerson() {
        Scanner sc = new Scanner(System.in);
        int numberPerson;
        do {
            System.out.println("Inter number student");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            numberPerson = sc.nextInt();
        } while (numberPerson < 1);
        return numberPerson;
    }

    public static String interName() {
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.println("Inter student's  name:");
            while (!sc.hasNextLine()) {
                System.out.println("Again");
                sc.next();
            }
            name = sc.nextLine();
        } while (name.length() < 1);
        return name;
    }

    public static int idPerson() {
        Scanner sc = new Scanner(System.in);
        int idPerson;
        do {
            System.out.println("Inter number id");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            idPerson = sc.nextInt();
        } while (idPerson < 0);
        return idPerson;
    }
}
