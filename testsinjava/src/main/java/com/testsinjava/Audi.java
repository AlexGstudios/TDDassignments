package com.testsinjava;

public class Audi extends Car{

    Audi(String color, String engine, String numberPlate){
        super(color, engine, numberPlate);
        construct();
    }
    
    protected void construct(){
        System.out.println("This is a Audi");
    }
}