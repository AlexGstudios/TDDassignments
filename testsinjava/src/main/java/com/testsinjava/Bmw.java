package com.testsinjava;

public class Bmw extends Car{

    String color;

    Bmw(String color){
        super(Brand.Bmw, color);
        construct();
    }
    
    @Override
    protected void construct(){
        System.out.println("This is a Bmw");
    }
}
