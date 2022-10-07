package com.taxi;

import com.taxi.driver.CarClass;
import com.taxi.ride.Ride;

import java.util.Arrays;
import java.util.Scanner;

public class ComTaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ride ride = new Ride();
        CarClass carClass = carTypeSelect(scanner);
        System.out.println("Enter you distance");
        ride.setDistance(scanner.nextDouble());
        double pricePerTrip = carClass.getPrice() * ride.getDistance();
        System.out.println("Your price for a trip is " + pricePerTrip + " dollars");
    }
    private static CarClass carTypeSelect (Scanner sk) {
        System.out.println("Hello, select your car class " + Arrays.toString(CarClass.values()));
        String carType = sk.next();
        carType = carType.toUpperCase();
        try {
         CarClass carC = CarClass.valueOf(carType);
            System.out.println("Your car class " + carType );
            return carC;
        } catch (IllegalArgumentException e) {
            System.out.println("what?");
            return carTypeSelect(sk);
        }
    }

}
