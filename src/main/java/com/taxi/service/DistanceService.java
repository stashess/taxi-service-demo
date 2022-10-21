package com.taxi.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistanceService {
    private static double getDistanceBetween(String city1, String city2) {
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI("https://www.distance-cities.com/search?from=" + city1 + "&to=" + city2)).build();
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Pattern pattern = Pattern.compile("(?<=<span id=\"rkm\">)(.*?)(?=</span>)");
            Matcher matcher = pattern.matcher(response.body());
            if (matcher.find())
            {
                String doubleValue = matcher.group(1);
                System.out.println(doubleValue);

                doubleValue = doubleValue.replaceAll("−", "-");
                doubleValue = doubleValue.replaceAll("[^-.,0-9]", "");

                DecimalFormat df = new DecimalFormat();
                System.out.println(doubleValue);
                return df.parse(doubleValue).doubleValue();
            }
        } catch (Exception ignored){
        }
        return 0;
    }
}
