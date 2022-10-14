package com.taxi.driver;

public enum CarClass {
    S(15), A(12), B(10), C(7);
    private double price;

    public double getPrice() {
        return price;
    }

    CarClass(double price) {
        this.price = price;
    }
}
