package com.taxi.driver;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    String name;
    CarClass type;

    public static CarClass carTypeSelect(Scanner sk) {
        System.out.println("Select, please, your car class " + Arrays.toString(CarClass.values()));
        String carType = sk.next();
        carType = carType.toUpperCase();
        try {
            CarClass carC = CarClass.valueOf(carType);
            System.out.println("Your car class " + carType);
            return carC;
        } catch (IllegalArgumentException e) {
            System.out.println("Unfortunately,there is no such class");
            return carTypeSelect(sk);
        }
    }


}
