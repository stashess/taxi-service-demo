package com.taxi.driver;

import com.taxi.delivery.Delivery;
import com.taxi.input.InputUtils;

public class Driver {

    private int id;
    private String name;
    private CarClass type;

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

    public static CarClass carTypeSelect() {
        return InputUtils.getEnumValue(CarClass.class);
    }

    public static Delivery deliverySelect() {
        return InputUtils.getEnumValue(Delivery.class);
    }


    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
