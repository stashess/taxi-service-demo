package com.taxi.driver;

public enum CarClass {
    S(15), A(11), B(8), C(6);
    private double price;

    public double getPrice() {
        return price;
    }

    CarClass(double price) {
        this.price = price;
    }
}
