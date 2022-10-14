package com.taxi.flow;

import com.taxi.flow.client.ClientFlow;
import com.taxi.flow.driver.DriverSelectionFlow;
import com.taxi.input.ApplicationClientType;
import com.taxi.input.InputUtils;

public class ClientTypeFlow extends Flow {


    private ClientFlow clientFlow = new ClientFlow();
    private DriverSelectionFlow driverFlow = new DriverSelectionFlow();


    private void showMenu() {
        System.out.println("Select your type: ");
    }

    public void process() {
        showMenu();
        ApplicationClientType type = InputUtils.getEnumValue(ApplicationClientType.class);
        if (ApplicationClientType.C.equals(type)) {
            clientFlow.process();
        } else if (ApplicationClientType.D.equals(type)) {
            driverFlow.process();
        }
    }
}
