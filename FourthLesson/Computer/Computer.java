package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String cpu, ram, hdd, name;
    public int limit;
    public boolean error, onOff;

    public Computer(String cpu, String ram, String hdd, boolean onOff, String name, int limit, boolean error) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.onOff = onOff;
        this.name = name;
        this.limit = limit;
        this.error = error;
    }


    public void show() {
        System.out.println("Name: " + name + " CPU: " + cpu + " RAM: " + ram + " HDD: " + hdd);
    }

    public static void showMas(Computer[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public static Computer[] createMas() {
        Computer[] mas = new Computer[3];
        mas[0] = new Computer("Intel Core i5", "DDR3", "128 Gb", false, "Apple Macbook Air 13", 5, false);
        mas[1] = new Computer("Intel Core i5", "DDR4", "256 Gb", false, "ASUS VivoBook 14", 3, false);
        mas[2] = new Computer("AMD Phenom || Dual-Core N620", "DDR3", "250 Gb", false, "HP Pavilion", 2, false);
        return mas;
    }

    public void on(int i) {
        if (!error) {
            if (!onOff) {
                if (limit != 0) {
                    Random random = new Random();
                    int j = random.nextInt(2);
                    System.out.println(j);
                    if (i == j) {
                        System.out.println("Computer turned ON");
                        onOff = true;
                    } else {
                        System.out.println("ERROR");
                        error = true;
                    }
                    limit--;
                } else {
                    System.out.println("ERROR");
                    error = true;
                }
            } else {
                System.out.println("In order to turn on the computer, you need to turn it off");
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public void off(int i) {
        if (!error) {
            if (!onOff) {
                if (limit != 0) {
                    Random random = new Random();
                    int j = random.nextInt(2);
                    System.out.println(j);
                    if (i == j) {
                        System.out.println("Computer turned OFF");
                        onOff = false;
                    } else {
                        System.out.println("ERROR");
                        error = true;
                    }
                    limit--;
                } else {
                    System.out.println("ERROR");
                    error = true;
                }
            } else {
                System.out.println("In order to turn off the computer, you need to turn it on");
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public static int int1() {
        Scanner sc = new Scanner(System.in);
        int j;
        do {
            System.out.println("Enter number computer:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            j = sc.nextInt();
        } while (j < 0 || j > 2);
        return j;
    }

    public static int int2() {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Enter 0 or 1:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            i = sc.nextInt();
        } while (i < 0 || i > 1);
        return i;
    }
}
