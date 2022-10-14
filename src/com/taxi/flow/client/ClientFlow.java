package com.taxi.flow.client;

import com.taxi.flow.Flow;
import com.taxi.input.InputUtils;
import com.taxi.repository.RideRepository;

import java.util.List;

public class ClientFlow extends Flow {

    List<Flow> flows = List.of(new OrderTaxiFlow(), new OrderDeliveryFlow(), new ShowHistoryFlow());

    private void showMenu() {
        System.out.println("Press 1 to order taxi");
        System.out.println("Press 2 to order delivery");
        System.out.println("Press 3 to show history");
        System.out.println("Press 4 to quit");
        System.out.println("");
    }

    @Override
    public void process() {
        while (true) {
            showMenu();
            int choice = InputUtils.getPositiveIntegerBetween(1, flows.size() + 1);

            if (choice == 1) {
                flows.get(0).process();
            } else if (choice == 2) {
                flows.get(1).process();
            } else if (choice == 3) {
                flows.get(2).process();
            } else {
                return;
            }
        }
    }

}
