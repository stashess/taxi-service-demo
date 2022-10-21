package com.taxi.flow.client;

import com.taxi.client.Client;
import com.taxi.flow.Flow;
import com.taxi.input.InputUtils;
import com.taxi.repository.ClientRepository;
import com.taxi.repository.Context;

import java.util.List;

public class ClientSelectionFlow extends Flow {

    final ClientFlow clientFlow = new ClientFlow();

    @Override
    public void process() {
        System.out.println("Please pick a profile to complete or press 0 to exit:");
        List<Client> clients = ClientRepository.showAndReturnClientsList();

        int choice = InputUtils.getPositiveIntegerBetween(0, clients.size());

        if (choice != 0) {
            Context.setCurrentClient(clients.get(choice - 1));
            System.out.println("Welcome back " + Context.CURRENT_CLIENT.getName() + "!");
            clientFlow.process();
        }
    }
}
