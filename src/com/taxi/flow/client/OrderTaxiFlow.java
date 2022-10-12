package com.taxi.flow.client;

import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.flow.Flow;
import com.taxi.ride.Ride;

public class OrderTaxiFlow extends Flow {
    @Override
    public void process() {
        Ride ride = new Ride();
        Driver driver = new Driver();
        CarClass carClass = driver.carTypeSelect();
        ride.distanceCheck();
        double pricePerTrip = carClass.getPrice() * ride.getDistance();
        System.out.println("Your price for a trip is " + pricePerTrip + " dollars");
        System.out.println("");
        System.out.println("You might order another taxi if you want");
        System.out.println("");
    }
}
