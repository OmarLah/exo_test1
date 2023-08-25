package org.example.test;

import org.example.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityTest {

    @Test
    public void testsearchCityWhenCityLength1() {

        City city  = new City();

        List result = city.searchCity("P");

        Assertions.assertEquals(null, result);
    }

    @Test
    public void testsearchCityWhenCityLengthSup2AndInListCity() {

        City city  = new City();

        List list = new ArrayList<String>(Arrays.asList("Paris"));

        List result = city.searchCity("Pa");

        Assertions.assertEquals(list, result);
    }

    @Test
    public void testsearchCityWhenCityLengthSup2AndInListCityAndCaseInsensitive() {

        City city  = new City();

        List list = new ArrayList<String>(Arrays.asList("Paris"));

        List result = city.searchCity("pa");

        Assertions.assertEquals(list, result);
    }

    @Test
    public void testsearchCityWhenCityLengthSup2AndInListCityAndCaseInsensitiveAndLettersInCity() {

        City city  = new City();

        List list = new ArrayList<String>(Arrays.asList("Paris", "Istanbul"));

        List result = city.searchCity("is");

        Assertions.assertEquals(list, result);
    }

    @Test
    public void testsearchCityWhenCityLengthSup2AndEgalAsterisk() {

        City city  = new City();

        List list = new ArrayList<String>(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"));

        List result = city.searchCity("*");

        Assertions.assertEquals(list, result);
    }

}



