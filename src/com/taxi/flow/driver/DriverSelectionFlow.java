package com.taxi.flow.driver;

import com.taxi.driver.Driver;
import com.taxi.flow.Flow;
import com.taxi.input.InputUtils;
import com.taxi.repository.Context;
import com.taxi.repository.DriverRepository;

import java.util.List;

public class DriverSelectionFlow extends Flow {

    final DriverFlow driverFlow = new DriverFlow();

    @Override
    public void process() {
        System.out.println("Please pick a profile to complete or press 0 to exit:");
        List<Driver> drivers = DriverRepository.showAndReturnDriversList();

        int choice = InputUtils.getPositiveIntegerBetween(0, drivers.size());

        if (choice != 0) {
            Context.setCurrentDriver(drivers.get(choice - 1));
            System.out.println("Welcome back " + Context.CURRENT_DRIVER.getName() + "!");
            driverFlow.process();
        }
    }
}
