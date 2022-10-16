package com.taxi.flow.driver;

import com.taxi.driver.CarClass;
import com.taxi.flow.Flow;
import com.taxi.input.InputUtils;
import com.taxi.repository.Context;
import com.taxi.repository.RideRepository;
import com.taxi.ride.Ride;

import java.time.LocalDateTime;
import java.util.List;

public class ShowRidesFlow extends Flow {

    @Override
    public void process() {
        System.out.println("Here are available rides:");
        List<Ride> rides = RideRepository.showAndReturnAvailableRidesList();



        System.out.println("Please pick a ride to complete or press 0 to exit:");
        int choice = InputUtils.getPositiveIntegerBetween(0, rides.size());

        if (choice == 0){
            return;
        } else {
            Ride ride = rides.get(choice - 1);
            ride.setTaxiDriver(Context.CURRENT_DRIVER);
            ride.setAccepted(LocalDateTime.now());
        }
    }
}
