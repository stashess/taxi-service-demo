package com.taxi.flow.client;

import com.taxi.delivery.Delivery;
import com.taxi.flow.Flow;
import com.taxi.repository.Context;
import com.taxi.repository.RideRepository;
import com.taxi.ride.Ride;
import com.taxi.service.ClientService;
import com.taxi.service.DriverService;

import java.time.LocalDateTime;

public class OrderDeliveryFlow extends Flow {

    private final ClientService clientService = ClientService.INSTANCE;
    private final DriverService driverService = DriverService.INSTANCE;

    @Override
    public void process() {
        Delivery delivery = driverService.enterDeliveryType();
        double distance = clientService.enterDistance();
        double pricePerDelivery = delivery.getPriceOfDelivery() * distance;

        System.out.println("Your price for a delivery is " + pricePerDelivery + " dollars\n");
        System.out.println("You might order another delivery or taxi if you want\n");

        Ride ride = new Ride();
        ride.setTaxiClient(Context.CURRENT_CLIENT);
        ride.setTaxiDelivery(delivery);
        ride.setRidePrice(pricePerDelivery);
        ride.setDistance(distance);
        ride.setCreated(LocalDateTime.now());
        RideRepository.save(ride);
    }
}


