package com.testsinjava;

public class Audi extends Car{

    String color;

    Audi(String color){
        super(Brand.Audi, color);
        construct();
    }
    
    protected void construct(){
        System.out.println("This is a Audi");
    }
}