package com.taxi.service;

import static com.taxi.input.InputUtils.getPositiveDouble;

public class ClientService {

    public static final ClientService INSTANCE = new ClientService();

    public double enterDistance() {
        System.out.println("Please,enter you distance.");
        return getPositiveDouble("Distance");
    }
}
