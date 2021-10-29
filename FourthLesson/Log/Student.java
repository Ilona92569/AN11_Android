package zad2;


import java.util.Scanner;

public class Student {
    public String students[];

    public Student() {
    }

    public Student(int studentsCount) {
        this.students = new String[studentsCount];
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        for (int i = 0; i < students.length; i++) {
            do {
                System.out.println((i + 1) + " student:");
                students[i] = sc.nextLine();
            } while (students[i].length() < 1);
        }
    }

    public void show(int i) {
        System.out.print((i + 1) + ". " + students[i] + " ");
    }


}
