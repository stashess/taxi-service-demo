package com.taxi.repository;

import com.taxi.client.Client;
import com.taxi.driver.Driver;

public class Context {
    public static Driver CURRENT_DRIVER;
    public static Client CURRENT_CLIENT;

    public static void setCurrentDriver(Driver currentDriver) {
        CURRENT_DRIVER = currentDriver;
    }

    public static void setCurrentClient(Client currentClient) {
        CURRENT_CLIENT = currentClient;
    }
}




