package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts numberOfCounts;

    @org.junit.Before
    public void setUp() throws Exception {
        numberOfCounts = new NumberOfCounts();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        numberOfCounts=null;
    }

    @Test
    public void calculateNumberOfCounts() {
        String inputString="one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectedMap=new HashMap<String, Integer>();
        expectedMap.put("one",5);
        expectedMap.put("two",2);
        expectedMap.put("three",2);
        Map<String, Integer> resultingMap = numberOfCounts.calculateNumberOfCounts(inputString);
        resultingMap.remove("");
        assertTrue(expectedMap.equals(resultingMap));
    }

    @Test
    public void calculateNumberOfCountsFailure() {
        String inputString="one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectedMap=new HashMap<String, Integer>();
        expectedMap.put("one",1);
        expectedMap.put("two",1);
        expectedMap.put("three",1);
        Map<String, Integer> resultingMap = numberOfCounts.calculateNumberOfCounts(inputString);
        resultingMap.remove("");
        assertFalse(expectedMap.equals(resultingMap));
    }

    @Test
    public void checkForNullInput()
    {
        String inputString="";
        Map<String, Integer> expectedMap=new HashMap<String, Integer>();
        Map<String, Integer> resultingMap = numberOfCounts.calculateNumberOfCounts(inputString);

        assertNull(numberOfCounts.calculateNumberOfCounts(inputString));
    }
}