package com.taxi.input;

public enum ApplicationClientType {
    D("Driver"),C("Client");

    private String name;

    ApplicationClientType(String name) {
        this.name = name;
    }
}
