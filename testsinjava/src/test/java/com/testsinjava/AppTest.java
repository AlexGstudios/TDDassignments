package com.testsinjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {

    private CarFactory carFactory = new CarFactory();
    private Car car;

    @Test
    void test_create_car() throws CarException {
        car = carFactory.createCar("Blue");
        assertNotNull(car);
    }

    @Test
    void test_create_car_brand() throws CarException {
        car = carFactory.createCar("Green");
        assertTrue(car instanceof Audi);
    }

    @Test
    void test_get_engine() throws CarException{
        car = carFactory.createCar("Blue");
        assertEquals("v6", car.getEngine());
    }

    @Test
    void test_create_car_brand_fail() throws CarException {
        CarException carException = assertThrows(CarException.class, () -> carFactory.createCar("lilac"));
        assertEquals("Not a brand", carException.getMessage());
    }
}
