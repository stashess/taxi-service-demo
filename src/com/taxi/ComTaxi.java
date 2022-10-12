package com.taxi;

import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.flow.GeneralFlow;
import com.taxi.ride.Ride;

import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComTaxi {


    //c / d
    //q


    //driver
    //q

    //user
    //замовити таксі
    // доставка
    // вийти в меню
    public static void main(String[] args) {
        GeneralFlow generalFlow = new GeneralFlow();
        generalFlow.process();
    }

}








