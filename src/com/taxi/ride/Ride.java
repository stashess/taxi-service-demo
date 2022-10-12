package com.taxi.ride;

import com.taxi.input.InputUtils;

import java.util.Scanner;

import static com.taxi.input.InputUtils.*;

public class Ride {
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;

    }

    public void distanceCheck() {
        System.out.println("Please,enter you distance.");
        distance = getPositiveDouble("Distance");
    }



}
