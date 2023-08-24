package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

public class FibTest {

    private Fib fib;


    @Test
    public void getFibSeriesRangeEgal1() {

        Fib fib = new Fib(1);

        List result = fib.getFibSeries();



        Assertions.assertEquals(Arrays.asList(0), result);
    }
    @Test
    public void getFibSeriesRangeEgal6andContains3() {

        Fib fib = new Fib(6);

//        List result = fib.getFibSeries();

        boolean result = fib.getFibSeries().contains(3);



        Assertions.assertEquals(true, result);
    }

    @Test
    public void getFibSeriesRangeEgal6andContains6() {

        Fib fib = new Fib(6);

//        List result = fib.getFibSeries();

        int result = fib.getFibSeries().size();



        Assertions.assertEquals(6, result);
    }

    @Test
    public void getFibSeriesRangeEgal6andNoContains4() {

        Fib fib = new Fib(6);


        boolean result = fib.getFibSeries().contains(4);



        Assertions.assertEquals(false, result);
    }

    @Test
    public void getFibSeriesRangeEgal6andContainsList() {

        Fib fib = new Fib(6);

        ArrayList list =  new ArrayList();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

    boolean result = fib.getFibSeries().equals(list);

        Assertions.assertEquals(true, result);
    }

    @Test
    public void getFibSeriesRangeEgal6andAssendant() {

        Fib fib = new Fib(6);

        List result = fib.getFibSeries();
        List fibList = result;
        Collections.sort(result);


        Assertions.assertEquals(fibList, result);
    }

}
