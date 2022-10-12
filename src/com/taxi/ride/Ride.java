package com.taxi.ride;

import java.util.Scanner;

public class Ride {
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;

    }

    public void distanceCheck(Scanner dsk) {
        System.out.println("Please,enter you distance.");
        if (dsk.hasNextDouble()) {
            double distanceLength = dsk.nextDouble();
            if (distanceLength < 0) {
                System.out.println("Distance cannot be negative.");
                distanceCheck(dsk);
            }
        } else {
            clearScanner(dsk);
            System.out.println("Unfortunately,distances measured in kilometers");
            distanceCheck(dsk);
        }
    }

    private void clearScanner(Scanner dsk) {
        dsk.next();
    }
}
