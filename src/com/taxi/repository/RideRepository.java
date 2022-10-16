package com.taxi.repository;

import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.ride.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RideRepository {
    private final static HashMap<Integer, Ride> RIDES = new HashMap<>(); // was HISTORY
    private static int COUNTER = 1;

    public static void save(Ride ride) {
        RIDES.put(COUNTER, ride);
        ride.setId(COUNTER);
        COUNTER = COUNTER + 1;
    }

    public static List<Ride> getAll() {
        return new ArrayList<>(RIDES.values());
    }


    public static List<Ride> showAndReturnAvailableRidesList() {
        List<Ride> all = getAll();
        List<Ride> available = new ArrayList<>();
        for (Ride ride : all) {
            if (CarClass.canAnotherTypeDoAnOrder(ride.getRequestedCarType(), Context.CURRENT_DRIVER.getType())
                    && ride.getTaxiDriver() == null
                    && Delivery.canAnotherTypeDoADelivery(ride.getTaxiDelivery(), Context.CURRENT_DRIVER.getDeliveryType())) {
                available.add(ride);
                System.out.println(available.size() + " | " + ride);
            }
        }

        System.out.println("Total rides : " + available.size());
        return available;
    }

    public static void showAndReturnCurrentClientHistory() {
        List<Ride> all1 = getAll();
        List<Ride> result = new ArrayList<>();
        for (Ride ride1 : all1) {
            if (ride1.getTaxiClient().getId() == Context.CURRENT_CLIENT.getId()) {
                result.add(ride1);
                System.out.println(result.size() + " | " + ride1);
            }
        }
        System.out.println("Total rides : " + result.size());
    }
}