package com.taxi.flow.client;

import com.taxi.flow.Flow;
import com.taxi.repository.RideRepository;

public class ShowHistoryFlow extends Flow {

    @Override
    public void process() {
        System.out.println("Ride history: ");
        RideRepository.showAndReturnCurrentClientHistory();
        System.out.println("");
    }


}