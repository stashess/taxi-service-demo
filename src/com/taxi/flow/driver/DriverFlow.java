package com.taxi.flow.driver;

import com.taxi.flow.Flow;
import com.taxi.input.InputUtils;

import java.util.List;

public class DriverFlow extends Flow {

    final List<Flow> flows = List.of(new ShowRidesFlow());

    private void showMenu() {
        System.out.println("Press 1 to show rides");
        System.out.println("Press 2 to quit");
        System.out.println("");
    }

    @Override
    public void process() {
        while (true) {
            showMenu();
            int choice = InputUtils.getPositiveIntegerBetween(1, flows.size() + 1);
            if (choice == 1) {
                flows.get(0).process();
            } else {
                return;
            }
        }
    }
}
