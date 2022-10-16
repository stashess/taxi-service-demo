package com.taxi.delivery;

import com.taxi.driver.CarClass;

public enum Delivery {
    XXL(20, 6), XL(17, 5), L(13, 4), M(10, 3), S(7, 2), XS(5, 1);

    public double getPriceOfDelivery() {
        return priceOfDelivery;
    }

    private double priceOfDelivery;

    Delivery(double priceOfDelivery, double deliveryClassification) {
        this.priceOfDelivery = priceOfDelivery;
        this.deliveryClassification = deliveryClassification;
    }

    private double deliveryClassification;
    public static boolean canAnotherTypeDoADelivery(Delivery clientRequestedCar, Delivery driverCar){
        if (clientRequestedCar == null) {
            return true;
        }
        if (clientRequestedCar != null && driverCar == null) {
            return false;
        }
        return driverCar.deliveryClassification >= clientRequestedCar.deliveryClassification;
    }
}