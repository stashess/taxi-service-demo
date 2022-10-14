package com.taxi.repository;

import com.taxi.ride.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RideRepository {
    private static HashMap<Integer, Ride> RIDES = new HashMap<>();
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
}
