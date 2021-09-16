package com.testsinjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    private CarFactory carFactory = new CarFactory();
    private Car car;

    @BeforeEach
    public void create_car(){
        car = carFactory.createCar(Brand.Bmw, "Silver");
    }

    @Test
    void create_car_bmw(){
        assertTrue(car instanceof Bmw);
    }

    @Test
    void create_car_audi() {
        car = carFactory.createCar(Brand.Audi, "Green");
        assertTrue(car instanceof Audi);
    }

    @Test
    void create_car_lada(){
        car = carFactory.createCar(Brand.Lada, "Blue");
        assertTrue(car instanceof Lada);
    }

    @Test
    void get_color(){
        assertEquals("Silver", car.getColor());
    }

    @Test
    void get_engine(){
        assertEquals("v8", car.getEngine());
    }

    @Test
    void get_number_plate(){
        assertEquals(car.getNumberPlate(), car.getNumberPlate());
    }
}
