package com.taxi.flow.client;

import com.taxi.flow.Flow;
import com.taxi.input.InputUtils;

import java.util.List;

public class ClientFlow extends Flow {

    List<Flow> flows = List.of(new OrderTaxiFlow());

    private void showMenu() {
        System.out.println("Press 1 to order taxi");
        System.out.println("Press 2 to quit");
        System.out.println("");
    }


    public void process() {
        while (true) {
            showMenu();
            int choice = InputUtils.getPositiveIntegerBetween(1, 2);

            if (choice == 1) {
                flows.get(0).process();
            } else {
                return;
            }
        }
    }

}
