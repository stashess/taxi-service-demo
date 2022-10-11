package com.taxi.delivery;

public enum Delivery {
    XXL(20), XL(17), L(13), M(10), S(7), XS(5);

    public double getPriceOfDelivery() {
        return priceOfDelivery;
    }

    private double priceOfDelivery;

    Delivery(double priceOfDelivery) {this.priceOfDelivery = priceOfDelivery;}
    }