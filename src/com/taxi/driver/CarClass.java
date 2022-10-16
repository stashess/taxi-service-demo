package com.taxi.driver;

@SuppressWarnings("unused")
public enum CarClass {
    S(15, 4), A(12, 3), B(10, 2), C(7, 1);
    private final double price;
    private final int carClassification;

    public double getPrice() {
        return price;
    }

    public int getCarClassification() {
        return carClassification;
    }

    CarClass(double price, int carClassification) {
        this.price = price;
        this.carClassification = carClassification;
    }

    public static boolean canAnotherTypeDoAnOrder(CarClass clientRequestedCar, CarClass driverCar) {
        if (clientRequestedCar == null) {
            return true;
        }
        if (driverCar == null) {
            return false;
        }


        return driverCar.carClassification >= clientRequestedCar.carClassification;
    }
}
