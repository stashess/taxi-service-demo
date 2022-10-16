package com.taxi.repository;

import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.ride.Ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DriverRepository {
    private static HashMap<Integer, Driver> DRIVERS = new HashMap<>();
    private static int COUNTER = 1;

    static {
        Driver driver = new Driver();
        driver.setName("Stanislav");
        driver.setType(CarClass.B);
        Driver driver1 = new Driver();
        driver1.setName("Dmytro");
        driver1.setType(CarClass.A);
        driver1.setDeliveryType(Delivery.L);
        Driver driver2  = new Driver();
        driver2.setName("Vasiliy");
        driver2.setDeliveryType(Delivery.XXL);
        save(driver);
        save(driver1);
        save(driver2);
    }

    public static int save(Driver driver) {
        DRIVERS.put(COUNTER, driver);
        driver.setId(COUNTER);
        COUNTER = COUNTER + 1;
        return driver.getId();
    }

    public static List<Driver> getAll() {
        return new ArrayList<>(DRIVERS.values());
    }

    public static List<Driver> showAndReturnDriversList() {
        List<Driver> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            Driver driver = all.get(i);
            System.out.println(driver.getId() + " | " + driver);
        }
        System.out.println("Total drivers : " + all.size());
        return all;
    }
}
