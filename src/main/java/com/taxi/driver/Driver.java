package com.taxi.driver;

import com.taxi.delivery.Delivery;

public class Driver {

    private int id;
    private String name;
    private CarClass type;

    private Delivery deliveryType;

    public Delivery getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Delivery deliveryType) {
        this.deliveryType = deliveryType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarClass getType() {
        return type;
    }

    public void setType(CarClass type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", deliveryType=" + deliveryType +
                '}';
    }
}
