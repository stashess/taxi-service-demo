package com.taxi;

import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.ride.Ride;

import java.util.Arrays;
import java.util.Scanner;

public class ComTaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ride ride = new Ride();
        Driver driver = new Driver();
        CarClass carClass = driver.carTypeSelect(scanner);
        ride.distanceCheck(scanner);
        double pricePerTrip = carClass.getPrice() * ride.getDistance();
        System.out.println("Your price for a trip is " + pricePerTrip + " dollars");

    }
}








