package com.taxi.delivery;

public enum Delivery {
    XXL(20), XL(18), L(13), M(10), S(12), XS(7);

    public double getPriceOfDelivery() {
        return priceOfDelivery;
    }

    private double priceOfDelivery;

    Delivery(double priceOfDelivery) {this.priceOfDelivery = priceOfDelivery;}
    }