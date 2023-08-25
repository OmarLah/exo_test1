package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {

    private List<String> listCity = new ArrayList<>(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"));


    public List searchCity(String city) {

        String cityLow = city.toLowerCase();
        List list = new ArrayList<>();

        if(city.length() >= 2) {
            int index = city.length();
            for (String c : listCity) {
                if(c.toLowerCase().contains(cityLow)) {
                    list.add(c);
                }
            }
            return list;
        } else if (city == "*") {
            list = listCity;
            return list;
        } else {
            return list = null;
        }
    }
}
