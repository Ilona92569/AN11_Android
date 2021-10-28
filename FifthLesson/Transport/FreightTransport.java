package com;

public class FreightTransport extends LandTransport{
    public int carryingCapacity;

    public FreightTransport(int carryingCapacity) {
        this.carryingCapacity=carryingCapacity;
    }

    public FreightTransport(int power, int maxSpeed, int  weight, String brand ,int numberOfWheels ,int fuelConsumption, int carryingCapacity) {
        this.carryingCapacity=carryingCapacity;
        this.power=power;
        this.maxSpeed=maxSpeed;
        this.weight=weight;
        this.brand=brand;
        this.numberOfWheels=numberOfWheels;
        this.fuelConsumption=fuelConsumption;
    }

    public double power(){
        return 0.74*power;
    }

    public void show() {
        System.out.println("Мощность: " + power + " лош. сил. "+" Мощность: " + power() + " кВ. " + " Максимальная скорость: " + maxSpeed + " км/ч " + " Масса: " + weight + " кг. " + " Марка: " + brand + " Колличество колёс: " + numberOfWheels  + " Расход топлива: " + fuelConsumption + " л/100км. " + " Грузоподъёмность: " + carryingCapacity + "  т. ");
    }

    public void cargo(double cargo){
        if(cargo<=carryingCapacity){
            System.out.println("Грузовик загружен");
        }
        else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
