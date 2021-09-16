package com.testsinjava;

public class CarFactory {   

    public String createNumberPlate(){

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        StringBuilder stringBuilder = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {
            if(i < 3){
                int index = (int) (letters.length * Math.random());
                stringBuilder.append(letters[index]);
            }else{
                int index = (int) (numbers.length * Math.random());
                stringBuilder.append(String.valueOf(numbers[index]));
            }
        }
        return stringBuilder.toString();
    }

    private String[] engine = {"4-takt", "v6", "v8"};

    public Car createCar(Brand brand, String color){
        Car car = null;

        switch(brand){
            case Audi:
                car = new Audi(color, engine[1], createNumberPlate());
                break;
            case Bmw:
                car = new Bmw(color, engine[2], createNumberPlate());
                break;
            case Lada:
                car = new Lada(color, engine[0], createNumberPlate());
                break;
            default:
                //will throw exception
                break;
        }
        return car;
    }
}