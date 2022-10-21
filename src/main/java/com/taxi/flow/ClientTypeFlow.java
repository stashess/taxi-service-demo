package com.taxi.flow;

import com.taxi.flow.client.ClientSelectionFlow;
import com.taxi.flow.driver.DriverSelectionFlow;
import com.taxi.input.ApplicationClientType;
import com.taxi.input.InputUtils;

public class ClientTypeFlow extends Flow {


    private final DriverSelectionFlow driverFlow = new DriverSelectionFlow();
    private final ClientSelectionFlow clientSelectionFlow = new ClientSelectionFlow();


    private void showMenu() {
        System.out.println("Select your type: ");
    }

    public void process() {
        showMenu();
        ApplicationClientType type = InputUtils.getEnumValueFromInput(ApplicationClientType.class);
        if (ApplicationClientType.C.equals(type)) {
            clientSelectionFlow.process();
        } else if (ApplicationClientType.D.equals(type)) {
            driverFlow.process();
        }
    }
}
