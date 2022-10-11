package com.taxi.ride;

import java.util.InputMismatchException;
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
        try {
            double distanceLength = dsk.nextDouble();
            if (distanceLength < 0 ) {
                System.out.println("Distance cannot be negative.");
                distanceCheck(dsk);
            } else {
                this.distance = distanceLength;
                System.out.println("Your distance " + distanceLength);
            }
        } catch (InputMismatchException e) {
            System.out.println("Unfortunately,distances measured in kilometers");
            dsk.next();
            distanceCheck(dsk);
        }
    }
}
