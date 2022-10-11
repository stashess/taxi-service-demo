package com.taxi.driver;

public enum CarClass {
    S(15), A(11), B(8), C(5);
    private double price;

    public double getPrice() {
        return price;
    }

    CarClass(double price) {
        this.price = price;
    }
}
