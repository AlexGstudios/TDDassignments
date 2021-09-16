package com.testsinjava;

public class Lada extends Car{

    Lada(String color, String engine, String numberPlate){
        super(Brand.Lada, color, engine, numberPlate);
        construct();
    }
    
    protected void construct(){
        System.out.println("This is a Lada");
    }
}