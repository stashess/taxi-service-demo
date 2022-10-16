package com.taxi.repository;

import com.taxi.client.Client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClientRepository {
    private static HashMap<Integer, Client> CLIENTS = new HashMap<>();
    private static int COUNTER = 1;

    static {
        Client client = new Client();
        client.setName("Dmytro");
        LocalDate date = LocalDate.of(2022, 9, 6);
        client.setRegistration(date);
        Client client1 = new Client();
        client1.setName("Stanislav");
        LocalDate date1 = LocalDate.of(2021, 1, 23);
        client1.setRegistration(date1);
        save(client);
        save(client1);

    }

    public static int save(Client client) {
        CLIENTS.put(COUNTER, client);
        client.setId(COUNTER);
        COUNTER = COUNTER + 1;
        return client.getId();
    }

    public static List<Client> getAll() {
        return new ArrayList<>(CLIENTS.values());
    }

    public static List<Client> showAndReturnClientsList() {
        List<Client> all = getAll();
        for (int i = 0; i < all.size(); i++) {
            Client client = all.get(i);
            System.out.println(client.getId() + " | " + client);
        }
        System.out.println("Total clients : " + all.size());
        return all;
    }
}
