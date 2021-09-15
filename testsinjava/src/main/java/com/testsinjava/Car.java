package com.testsinjava;

public abstract class Car {

    public Car(Brand brand, String color){
        this.brand = brand;
        this.color = color;
    }

    protected abstract void construct();

    private Brand brand = null;
    private String color;

    public Brand getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public void setModel(Brand brand, String color){
        this.brand = brand;
        this.color = color;
    }
}
