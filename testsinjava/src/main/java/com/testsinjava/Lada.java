package com.testsinjava;

public class Lada extends Car{

    Lada(String color, String engine, String numberPlate){
        super(color, engine, numberPlate);
        construct();
    }
    
    protected void construct(){
        System.out.println("This is a Lada");
    }
}