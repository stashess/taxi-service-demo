package com.taxi.repository;

import com.taxi.ride.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RideRepository {
    private static HashMap<Integer, Ride> HISTORY = new HashMap<>();
    private static int COUNTER = 1;

    public static int save(Ride ride) {
        HISTORY.put(COUNTER, ride);
        ride.setId(COUNTER);
        COUNTER = COUNTER + 1;
        return ride.getId();
    }

    public static List<Ride> getAll() {
        return new ArrayList<>(HISTORY.values());
    }
}
