package com.testsinjava;

public class CarFactory {
    public Car createCar(Brand brand, String color){
        Car car = null;

        switch(brand){
            case Audi:
                car = new Audi(color);
                break;
            case Bmw:
                car = new Bmw(color);
                break;
            case Lada:
                car = new Lada(color);
                break;
            default:
                //will throw exception
                break;
        }
        return car;
    }
}