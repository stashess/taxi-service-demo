package com.taxi.flow.client;

import com.taxi.driver.CarClass;
import com.taxi.flow.Flow;
import com.taxi.repository.Context;
import com.taxi.repository.RideRepository;
import com.taxi.ride.Ride;
import com.taxi.service.ClientService;
import com.taxi.service.DriverService;

import java.time.LocalDateTime;

public class OrderTaxiFlow extends Flow {


    private final ClientService clientService = ClientService.INSTANCE;
    private final DriverService driverService = DriverService.INSTANCE;

    @Override
    public void process() {
        CarClass carClass = driverService.enterCarType();
        double distance = clientService.enterDistance();
        double pricePerTrip = carClass.getPrice() * distance;

        System.out.println("Your price for a trip is " + pricePerTrip + " dollars\n");
        System.out.println("You might order another taxi or delivery if you want\n");

        Ride ride = new Ride();
        ride.setTaxiClient(Context.CURRENT_CLIENT);
        ride.setRequestedCarType(carClass);
        ride.setRidePrice(pricePerTrip);
        ride.setDistance(distance);
        ride.setCreated(LocalDateTime.now());
        RideRepository.save(ride);
    }
}
