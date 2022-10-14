package com.taxi.ride;

import com.taxi.client.Client;
import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.input.InputUtils;

import java.util.Scanner;

import static com.taxi.input.InputUtils.*;

public class Ride {

    private int id;

    private double distance;
    private Driver taxiDriver;

    private CarClass requestedCarType;

    private double ridePrice;

    private Client taxiClient;
    private Delivery taxiDelivery;

    public Delivery getTaxiDelivery() {
        return taxiDelivery;
    }

    public void setTaxiDelivery(Delivery taxiDelivery) {
        this.taxiDelivery = taxiDelivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Driver getTaxiDriver() {
        return taxiDriver;
    }

    public void setTaxiDriver(Driver taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    public CarClass getRequestedCarType() {
        return requestedCarType;
    }

    public void setRequestedCarType(CarClass requestedCarType) {
        this.requestedCarType = requestedCarType;
    }

    public double getRidePrice() {
        return ridePrice;
    }

    public void setRidePrice(double ridePrice) {
        this.ridePrice = ridePrice;
    }

    public Client getTaxiClient() {
        return taxiClient;
    }

    public void setTaxiClient(Client taxiClient) {
        this.taxiClient = taxiClient;
    }

    public double distanceCheck() {
        System.out.println("Please,enter you distance.");
        return getPositiveDouble("Distance");
    }

    @Override
    public String toString() {
        return "Ride " +
                "id=" + id +
                ", distance=" + distance +
                ", taxiDriver=" + taxiDriver +
                ", requestedCarType=" + requestedCarType +
                ", ridePrice=" + ridePrice +
                ", taxiClient=" + taxiClient +
                ", taxiDelivery=" + taxiDelivery +
                '.';
    }
}
