package com.taxi.repository;

import com.taxi.driver.CarClass;
import com.taxi.ride.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RideRepository {
    private static HashMap<Integer, Ride> RIDES = new HashMap<>(); // was HISTORY
    private static int COUNTER = 1;

    public static int save(Ride ride) {
        RIDES.put(COUNTER, ride);
        ride.setId(COUNTER);
        COUNTER = COUNTER + 1;
        return ride.getId();
    }

    public static List<Ride> getAll() {
        return new ArrayList<>(RIDES.values());
    }

    public static List<Ride> showAndReturnRidesList() {
        List<Ride> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            Ride ride = all.get(i);
            System.out.println(ride.getId() + " | " + ride);
        }
        System.out.println("Total rides : " + all.size());
        return all;
    }
    public static List<Ride> showAndReturnAvailableRidesList() {
        List<Ride> all = getAll();
        List<Ride> available = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            Ride ride = all.get(i);
            if (CarClass.canAnotherTypeDoAnOrder(ride.getRequestedCarType(),Context.CURRENT_DRIVER.getType()) && ride.getTaxiDriver()== null){
                available.add(ride);
                System.out.println(available.size() + " | " + ride);
            }
        }
        System.out.println("Total rides : " + available.size());
        return available;
    }

}
