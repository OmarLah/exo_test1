package org.example;

public class LeapYear {

    private int year;



    public boolean isLeapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ||  year % 4000 == 0) {
            return true;
        }
        return false;
    }
}
