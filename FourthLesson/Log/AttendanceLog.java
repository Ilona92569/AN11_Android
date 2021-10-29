package zad2;

import java.util.Scanner;

public class AttendanceLog {
    public String log[][];

    public AttendanceLog(int studentsCount, int lessonsCount) {
        this.log = new String[studentsCount + 1][lessonsCount];
    }

    public void show(Student ob1) {
        System.out.println();
        for (int i = 1; i < log.length; i++) {
            ob1.show((i - 1));
            for (int j = 0; j < log[i].length; j++) {
                System.out.print(log[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void zad() {
        for (int i = 0; i < log[0].length; i++) {
            log[0][i] = String.valueOf((i + 1));
        }
    }

    public static int int1(int i) { // student
        Scanner sc = new Scanner(System.in);
        int j;
        do {
            System.out.println("Enter student number:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            j = sc.nextInt();
        } while (j < 0 || j > i);
        return j;
    }

    public static int int2(int i) { //lesson
        Scanner sc = new Scanner(System.in);
        int j;
        do {
            System.out.println("Enter lesson number:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            j = sc.nextInt();
        } while (j < 0 || j > i);
        return j;
    }

    public void present(int i, int j) {
        log[i][j - 1] = "+";
    }

    public void absent(int i, int j) {
        log[i][j - 1] = "-";
    }

    public void add(Student ob1, int lessonsCount) {
        Scanner sc = new Scanner(System.in);
        String[] students2 = new String[ob1.students.length + 1];
        for (int i = 0; i < ob1.students.length; i++) {
            students2[i] = ob1.students[i];
        }
        System.out.println("Enter student name:");
        do {
            students2[students2.length - 1] = sc.nextLine();
        } while (students2[students2.length - 1].length() < 1);
        String[][] log2 = new String[log.length + 1][lessonsCount];
        for (int i = 0; i < log.length; i++) {
            for (int j = 0; j < log[i].length; j++) {
                log2[i][j] = log[i][j];
            }
        }
        ob1.students = students2;
        log = log2;
    }

    public void delete(int k, Student ob1, int lessonsCount) {
        String[] students2 = new String[ob1.students.length - 1];
        for (int i = 0; i < k; i++) {
            students2[i] = ob1.students[i];
        }
        for (int i = k; i < ob1.students.length - 1; i++) {
            students2[i] = ob1.students[i + 1];
        }
        String[][] log2 = new String[log.length - 1][lessonsCount];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < log[i].length; j++) {
                log2[i][j] = log[i][j];
            }
        }
        for (int i = k + 1; i < log.length - 1; i++) {
            for (int j = 0; j < log[i].length; j++) {
                log2[i][j] = log[i + 1][j];
            }
        }
        ob1.students = students2;
        log = log2;
    }
}
