package com;

public class CivilTransport extends AirTransport {
    public int numberOfPassenger;
    public boolean businessClass;


    public CivilTransport(int power, int maxSpeed, int  weight, String brand ,int wingSize,int minRunway, int numberOfPassenger, boolean businessClass) {
        this.numberOfPassenger = numberOfPassenger;
        this.businessClass = businessClass;
        this.power=power;
        this.maxSpeed=maxSpeed;
        this.weight=weight;
        this.brand=brand;
        this.wingSize=wingSize;
        this.minRunway=minRunway;
    }

    public double power(){
        return 0.74*power;
    }

    public void show() {
        System.out.println("Мощность: " + power + " лош. сил. "+" Мощность: " + power() + " кВ. " + " Максимальная скорость: " + maxSpeed + " км/ч " + " Масса: " + weight + " кг. " + " Марка: " + brand + " Размах крыльев: " + wingSize + " м. " + " Минимальнная длина взлётно-посадочной полосы: " + minRunway + " м. " + " Количество пассажиров: " + numberOfPassenger + " Наличие бизнес класса: " + businessClass);
    }

    public void passengers(int passengers){
        if(passengers<=numberOfPassenger){
            System.out.println("Самолёт заполнен");
        }
        else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
