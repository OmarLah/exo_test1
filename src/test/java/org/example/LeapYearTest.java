package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;


public class LeapYearTest {

    private LeapYear leapYear;
    @BeforeEach
    void setup() {
        leapYear = new LeapYear();
    }
    @Test
    public void testIsLeapYearIfYearIsdivisbleBy400() {

//        LeapYear leapYear = new LeapYear();

        Assertions.assertTrue(leapYear.isLeapYear(2000));
    }

    @Test
    public void testIsLeapYearIfYearIsdivisbleBy4andNotBy100() {

//        LeapYear leapYear = new LeapYear();

        Assertions.assertTrue(leapYear.isLeapYear(2004));
    }

    @Test
    public void testIsLeapYearIfYearReturnFalse() {

//        LeapYear leapYear = new LeapYear();

        Assertions.assertFalse(leapYear.isLeapYear(2009));
    }
}
