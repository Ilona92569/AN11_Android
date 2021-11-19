package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberStudent = Utils.numberStudent();
        int index = 0;
        List<String> student = new ArrayList<>();
        for (int i = 0; i < numberStudent; i++) {
            student.add(index, Utils.interName());
            index++;
        }
        int numberLesson = Utils.numberLesson();
        index = 0;
        List<char[]> log = new ArrayList<>();
        for (int i = 0; i < numberStudent; i++) {
            log.add(index, new Log(numberLesson).log);
            index++;
        }
        int task;
        do {
            System.out.println("Enter task:");
            System.out.println("1-Mark the present");
            System.out.println("2-Add student");
            System.out.println("3-Delete student");
            System.out.println("4-Show log");
            System.out.println("5-Exit");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            task = sc.nextInt();
            switch (task) {
                case 1:
                    Log.markThePresence(student, log, numberLesson);
                    break;
                case 2:
                    Log.addStudent(student, log, numberLesson);
                    break;
                case 3:
                    Log.deleteStudent(student, log);
                    break;
                case 4:
                    Log.showLog(student, log, numberStudent);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("There is no such task");
            }
        } while (task != 5);
    }
}

