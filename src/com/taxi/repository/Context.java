package com.taxi.repository;

import com.taxi.driver.Driver;

public class Context {
    public static Driver CURRENT_DRIVER;

    public static void setCurrentDriver(Driver currentDriver) {
        CURRENT_DRIVER = currentDriver;
    }
}
