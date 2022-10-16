package com.taxi.delivery;

public enum Delivery {
    XXL(20, 6), XL(17, 5), L(13, 4), M(10, 3), S(7, 2), XS(5, 1);

    public double getPriceOfDelivery() {
        return priceOfDelivery;
    }

    private final double priceOfDelivery;

    Delivery(double priceOfDelivery, double deliveryClassification) {
        this.priceOfDelivery = priceOfDelivery;
        this.deliveryClassification = deliveryClassification;
    }

    private final double deliveryClassification;
    public static boolean canAnotherTypeDoADelivery(Delivery clientRequestedCar, Delivery driverCar){
        if (clientRequestedCar == null) {
            return true;
        }
        if (driverCar == null) {
            return false;
        }
        return driverCar.deliveryClassification >= clientRequestedCar.deliveryClassification;
    }
}