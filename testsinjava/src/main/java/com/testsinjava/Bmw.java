package com.testsinjava;

public class Bmw extends Car{

    Bmw(String color, String engine, String numberPlate){
        super(color, engine, numberPlate);
        construct();
    }
    
    @Override
    protected void construct(){
        System.out.println("This is a Bmw");
    }
}
