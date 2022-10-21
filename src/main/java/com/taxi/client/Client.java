package com.taxi.client;

import java.time.LocalDate;

public class Client {


    private int id;
    private String name;
    private LocalDate registration;

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

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Client " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registration=" + registration +
                '.';
    }
}


