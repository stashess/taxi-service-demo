package com.taxi.driver;

import com.taxi.delivery.Delivery;
import com.taxi.input.InputUtils;

public class Driver {

    String name;
    CarClass type;

    public static CarClass carTypeSelect() {
        return InputUtils.getEnumValue(CarClass.class);
    }

    public static Delivery deliverySelect() {
        return InputUtils.getEnumValue(Delivery.class);
    }


}
