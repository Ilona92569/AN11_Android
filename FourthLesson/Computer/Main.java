package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer[] mas = Computer.createMas();
        int pr;
        do {
            System.out.println("Select a tack:");
            System.out.println("1 - Output of information about computers");
            System.out.println("2 - Turning on the computer");
            System.out.println("3 - Turning off the computer");
            System.out.println("4 - Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            pr = sc.nextInt();
            switch (pr) {
                case 1:
                    Computer.showMas(mas);
                    break;
                case 2:
                    int j = Computer.int1(), i;
                    i = Computer.int2();
                    mas[j].on(i);
                    break;
                case 3:
                    j = Computer.int1();
                    i = Computer.int2();
                    mas[j].off(i);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("There is no such tack number");
            }
        }
        while (pr != 4);
    }
}
