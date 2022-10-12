package com.taxi.flow;

import com.taxi.input.InputUtils;

import java.util.List;

public class GeneralFlow extends Flow {

    List<Flow> flows = List.of(new ClientTypeFlow());

    private void showMenu() {
        System.out.println("Press 1 to select user");
        System.out.println("Press 2 to quit");
        System.out.println("");
    }


    public void process() {
        showMenu();
        int choice = InputUtils.getPositiveIntegerBetween(1, 2);
        if (choice == 1) {
            flows.get(0).process();
        }
        System.out.println("Thank you for using comTaxi");
    }

}
