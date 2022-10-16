package com.taxi.service;

import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.input.InputUtils;

public class DriverService {

    public static final DriverService INSTANCE = new DriverService();

    public CarClass enterCarType() {
        return InputUtils.getEnumValue(CarClass.class);
    }

    public Delivery enterDeliveryType() {
        return InputUtils.getEnumValue(Delivery.class);
    }

}
