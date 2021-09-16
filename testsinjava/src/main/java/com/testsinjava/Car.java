package com.testsinjava;

public abstract class Car {

    public Car(Brand brand, String color, String engine, String numberPlate){
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.numberPlate = numberPlate;
    }

    protected abstract void construct();

    private Brand brand = null;
    private String color;
    private String engine;
    private String numberPlate;

    public Brand getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public String getEngine(){
        return engine;
    }

    public String getNumberPlate(){
        return numberPlate;
    }

    public void setModel(Brand brand, String color, String engine, String numberPlate){
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.numberPlate = numberPlate;
    }
}