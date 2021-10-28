package com;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task;
        LightTransport lightTransportAudi = new LightTransport(150, 250, 3, "Audi", 4, 25, 2, "Roadster");
        LightTransport lightTransportPorsche = new LightTransport(200, 300, 2, "Porsche", 4, 15, 2, "Roadster");
        FreightTransport freightTransportMAZ = new FreightTransport(350, 150, 9, "MAZ", 8, 50, 5);
        FreightTransport freightTransportBelMaz = new FreightTransport(350, 140, 10, "BelMAZ", 10, 60, 15);
        CivilTransport civilTransportBelavia = new CivilTransport(560, 560, 92, "Belavia", 70, 950, 250, true);
        CivilTransport civilTransportATP = new CivilTransport(560, 600, 100, "ATP", 75, 1000, 74, false);
        MilitaryTransport militaryTransportBoeing = new MilitaryTransport(600, 560, 120, "Boeing", 65, 650, true, 45);
        MilitaryTransport militaryTransportLockheed = new MilitaryTransport(620, 869, 172, "Lockheed", 65, 650, false, 0);
        do {
            System.out.println("Выберете задание:");
            System.out.println("1-Вывести весь транспорт");
            System.out.println("2-Задание с легковыми машинами");
            System.out.println("3-Задание с грузовыми машинами");
            System.out.println("4-Задание с гражданскими самолётами");
            System.out.println("5-Задание с военными самолётами");
            System.out.println("6-Выход");
            while (!sc.hasNextInt()) {
                System.out.println("Ещё раз");
                sc.next();
            }
            task = sc.nextInt();
            switch (task) {
                case 1:
                    lightTransportAudi.show();
                    lightTransportPorsche.show();
                    freightTransportMAZ.show();
                    freightTransportBelMaz.show();
                    civilTransportBelavia.show();
                    civilTransportATP.show();
                    militaryTransportBoeing.show();
                    militaryTransportLockheed.show();
                    break;
                case 2:
                    double time;
                    do {
                        System.out.println("Введите время");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        time = sc.nextDouble();
                    } while (time < 0);
                    int lightTransport;
                    do {
                        System.out.println("Введите номер машины(1 или 2)");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        lightTransport = sc.nextInt();
                    } while (lightTransport != 1 && lightTransport != 2);
                    if (lightTransport == 1) {
                        lightTransportAudi.trip(time);
                    }
                    if (lightTransport == 2) {
                        lightTransportPorsche.trip(time);
                    }
                    break;
                case 3:
                    double cargo;
                    do {
                        System.out.println("Введите груз");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        cargo = sc.nextDouble();
                    } while (cargo < 0);
                    int freightTransport;
                    do {
                        System.out.println("Введите номер машины(1 или 2)");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        freightTransport = sc.nextInt();
                    } while (freightTransport != 1 && freightTransport != 2);
                    if (freightTransport == 1) {
                        freightTransportMAZ.cargo(cargo);
                    }
                    if (freightTransport == 2) {
                        freightTransportBelMaz.cargo(cargo);
                    }
                    break;
                case 4:
                    int person;
                    do {
                        System.out.println("Введите кол-во пассажиров");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        person = sc.nextInt();
                    } while (person < 0);
                    int civilTransport;
                    do {
                        System.out.println("Выберите номер самолёта(1 или 2)");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        civilTransport = sc.nextInt();
                    } while (civilTransport != 1 && civilTransport != 2);
                    if (civilTransport == 1) {
                        civilTransportBelavia.passengers(person);
                    }
                    if (civilTransport == 2) {
                        civilTransportATP.passengers(person);
                    }
                    break;
                case 5:
                    int militaryTransport;
                    do {
                        System.out.println("Выберите номер самолёта (1 или 2)");
                        while (!sc.hasNextInt()) {
                            System.out.println("Ещё раз");
                            sc.next();
                        }
                        militaryTransport = sc.nextInt();
                    } while (militaryTransport != 1 && militaryTransport != 2);
                    if (militaryTransport == 1) {
                        militaryTransportBoeing.shot();
                        militaryTransportBoeing.ejection();
                    }
                    if (militaryTransport == 2) {
                        militaryTransportLockheed.shot();
                        militaryTransportLockheed.ejection();
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Такого задания нет)");
            }
        } while (task != 6);
    }
}