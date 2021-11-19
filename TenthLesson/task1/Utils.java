package task1;

import java.util.List;
import java.util.Scanner;

public class Utils {
    public static int numberStudent() {
        Scanner sc = new Scanner(System.in);
        int numberStudent;
        do {
            System.out.println("Inter number student");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            numberStudent = sc.nextInt();
        } while (numberStudent < 1);
        return numberStudent;
    }

    public static int numberLesson() {
        Scanner sc = new Scanner(System.in);
        int numberLesson;
        do {
            System.out.println("Inter number lesson");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            numberLesson = sc.nextInt();
        } while (numberLesson < 1);
        return numberLesson;
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

    public static int indexStudent(List<String> student) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Inter student's  index:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 1 || number >= student.size());
        return number;
    }

    public static int indexLesson(int numberLesson) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Inter lesson's  index:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 1 || number > numberLesson);
        return number;
    }
}