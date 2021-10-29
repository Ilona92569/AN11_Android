package zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        do {
            System.out.println("Enter the number of students:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            i = sc.nextInt();
        } while (i < 1);
        do {
            System.out.println("Enter the number of lessons:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            j = sc.nextInt();
        } while (j < 1);
        Student ob = new Student(i);
        ob.addStudent();
        AttendanceLog ob2 = new AttendanceLog(i, j);
        ob2.zad();
        int pr;
        do {
            System.out.println("Select a tack:");
            System.out.println("1 - Output of information about log");
            System.out.println("2 - Mark the present");
            System.out.println("3 - Mark the absent");
            System.out.println("4 - Add student");
            System.out.println("5 - Delete student");
            System.out.println("6 - Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            pr = sc.nextInt();
            switch (pr) {
                case 1:
                    ob2.show(ob);
                    break;
                case 2:
                    int s = AttendanceLog.int1(i);
                    int l = AttendanceLog.int2(j);
                    ob2.present(s, l);
                    break;
                case 3:
                    s = AttendanceLog.int1(i);
                    l = AttendanceLog.int2(j);
                    ob2.absent(s, l);
                    break;
                case 4:
                    ob2.add(ob, j);
                    break;
                case 5:
                    int k;
                    do {
                        System.out.println("Enter the student you want to remove:");
                        while (!sc.hasNextInt()) {
                            System.out.println("Again");
                            sc.next();
                        }
                        k = sc.nextInt();
                    } while (k < 1);
                    ob2.delete((k - 1), ob, j);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("There is no such tack number");

            }
        } while (pr != 6);
    }
}
