package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void testIsLeapYearIfYearIsdivisbleBy400() {

        LeapYear leapYear = new LeapYear();

        Assertions.assertTrue(leapYear.isLeapYear(2000));
    }

    @Test
    public void testIsLeapYearIfYearIsdivisbleBy4andNotBy100() {

        LeapYear leapYear = new LeapYear();

        Assertions.assertTrue(leapYear.isLeapYear(2004));
    }

    @Test
    public void testIsLeapYearIfYearReturnFalse() {

        LeapYear leapYear = new LeapYear();

        Assertions.assertFalse(leapYear.isLeapYear(2009));
    }
}
