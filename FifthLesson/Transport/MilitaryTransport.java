package com;

public class MilitaryTransport extends  AirTransport{
    public boolean ejection;
    public int numberOfMissiles;

    public MilitaryTransport(int power, int maxSpeed, int  weight, String brand ,int wingSize,int minRunway, boolean ejection, int numberOfMissiles) {
        this.ejection=ejection;
        this.numberOfMissiles=numberOfMissiles;
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
        System.out.println("Мощность: " + power + " лош. сил. "+" Мощность: " + power() + " кВ. " + " Максимальная скорость: " + maxSpeed + " км/ч " + " Масса: " + weight + " кг. " + " Марка: " + brand + " Размах крыльев: " + wingSize + " м. " + " Минимальнная длина взлётно-посадочной полосы: " + minRunway + " м. " + " Наличие системы катапультирования: " + ejection + " Количество ракет на борту: " + numberOfMissiles);
    }

    public void shot(){
        if(numberOfMissiles>0){
            System.out.println("Ракета пошла...");
        }
        else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection(){
        if(ejection){
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("У вас нет такой системы");
        }
    }
}
