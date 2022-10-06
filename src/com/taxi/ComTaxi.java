package com.taxi;

import com.taxi.driver.CarClass;
import com.taxi.ride.Ride;

import java.util.Scanner;

public class ComTaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ride ride = new Ride();
        System.out.println("Hello, select your car class S,A,B,C");
        String carType = scanner.next();
        CarClass carClass = CarClass.valueOf(carType);
        System.out.println("Enter you distance");
        ride.setDistance(scanner.nextDouble());
        double pricePerTrip = carClass.getPrice() * ride.getDistance();
        System.out.println("Your price for a trip is " + pricePerTrip + " dollars");
    }
}
