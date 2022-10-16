package com.taxi.flow.client;

import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.flow.Flow;
import com.taxi.repository.Context;
import com.taxi.repository.RideRepository;
import com.taxi.ride.Ride;

import java.time.LocalDateTime;

public class OrderDeliveryFlow extends Flow {
    @Override
    public void process() {
        Ride ride1 = new Ride();
        Driver driver = new Driver();
        Delivery delivery = driver.deliverySelect();
        double distance = ride1.distanceCheck();
        double pricePerDelivery = delivery.getPriceOfDelivery() * distance;
        System.out.println("Your price for a delivery is " + pricePerDelivery + " dollars");
        System.out.println("");
        System.out.println("You might order another delivery or taxi if you want");
        System.out.println("");
        ride1.setTaxiClient(Context.CURRENT_CLIENT);
        ride1.setTaxiDelivery(delivery);
        ride1.setRidePrice(pricePerDelivery);
        ride1.setDistance(distance);
        ride1.setCreated(LocalDateTime.now());
        RideRepository.save(ride1);
    }
}


