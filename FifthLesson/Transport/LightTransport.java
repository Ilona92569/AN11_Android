package com;

public class LightTransport extends LandTransport {
    public String bodyType;
    public int numberOfPassenger;

    public LightTransport(String bodyType, int numberOfPassenger) {
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public LightTransport(int power, int maxSpeed, int  weight, String brand ,int numberOfWheels ,int fuelConsumption, int numberOfPassenger, String bodyType) {
        this.numberOfPassenger = numberOfPassenger;
        this.bodyType=bodyType;
        this.power=power;
        this.maxSpeed=maxSpeed;
        this.weight=weight;
        this.brand=brand;
        this.numberOfWheels=numberOfWheels;
        this.fuelConsumption=fuelConsumption;
    }

    public double power() {
        return 0.74 * power;
    }

    public void show() {
        System.out.println("Мощность: " + power + " лош. сил. " + " Мощность: " + power() + " кВ. " + " Максимальная скорость: " + maxSpeed + " км/ч " + " Масса: " + weight + " кг. " + " Марка: " + brand + " Колличество колёс: " + numberOfWheels + " Расход топлива: " + fuelConsumption + " л/100км. " + " Тип кузова: " + bodyType + " Количество пассажиров: " + numberOfPassenger);
    }

    public void trip(double time) {
        double distance = maxSpeed * time;
        System.out.println("За время " + time + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч проедет " + distance + "км и израсходует " + consumedFuel(distance) + " литров топлива.");
    }

    private double consumedFuel(double distance) {
        return (distance * fuelConsumption) / 100;
    }
}
