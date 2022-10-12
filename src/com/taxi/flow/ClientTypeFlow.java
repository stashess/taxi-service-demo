package com.taxi.flow;

import com.taxi.flow.client.ClientFlow;
import com.taxi.input.ApplicationClientType;
import com.taxi.input.InputUtils;

public class ClientTypeFlow extends Flow {


    private void showMenu(){
        System.out.println("Select your type: ");
    }

    public void process(){
        showMenu();
        ApplicationClientType type = InputUtils.getEnumValue(ApplicationClientType.class);
        if (ApplicationClientType.C.equals(type)){
            ClientFlow clientFlow = new ClientFlow();
            clientFlow.process();
        } else {
            return;
        }
    }
}
