package com.taxi.ride;

import com.taxi.client.Client;
import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;

import java.time.LocalDateTime;

public class Ride {

    private int id;

    private double distance;
    private Driver taxiDriver;

    private CarClass requestedCarType;

    private double ridePrice;

    private Client taxiClient;
    private Delivery taxiDelivery;
    private LocalDateTime created;
    private LocalDateTime accepted;

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getAccepted() {
        return accepted;
    }

    public void setAccepted(LocalDateTime accepted) {
        this.accepted = accepted;
    }

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


    @Override
    public String toString() {
        return "Ride {" +
                "id=" + id +
                ", distance=" + distance +
                ", taxiDriver=" + taxiDriver +
                ", requestedCarType=" + requestedCarType +
                ", ridePrice=" + ridePrice +
                ", taxiClient=" + taxiClient +
                ", taxiDelivery=" + taxiDelivery +
                ", created=" + created +
                ", accepted=" + accepted +
                '}';
    }
}
