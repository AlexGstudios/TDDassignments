package com.testsinjava;

public class Lada extends Car{

    String color;

    Lada(String color){
        super(Brand.Lada, color);
        construct();
    }
    
    protected void construct(){
        System.out.println("This is a Lada");
    }
}