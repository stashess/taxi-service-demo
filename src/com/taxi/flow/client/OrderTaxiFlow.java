package com.taxi.flow.client;

import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.flow.Flow;
import com.taxi.repository.Context;
import com.taxi.repository.RideRepository;
import com.taxi.ride.Ride;

import java.time.LocalDateTime;

public class OrderTaxiFlow extends Flow {
    @Override
    public void process() {
        Ride ride1 = new Ride();
        Driver driver = new Driver();
        CarClass carClass = driver.carTypeSelect();
        double distance = ride1.distanceCheck();
        double pricePerTrip = carClass.getPrice() * distance;
        System.out.println("Your price for a trip is " + pricePerTrip + " dollars");
        System.out.println("");
        System.out.println("You might order another taxi or delivery if you want");
        System.out.println("");
        ride1.setTaxiClient(Context.CURRENT_CLIENT);
        ride1.setRequestedCarType(carClass);
        ride1.setRidePrice(pricePerTrip);
        ride1.setDistance(distance);
        ride1.setCreated(LocalDateTime.now());
        RideRepository.save(ride1);
    }
}
