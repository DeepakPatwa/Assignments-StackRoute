package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyMapTest {

    FrequencyMap frequencyMap;

    @org.junit.Before
    public void setUp() throws Exception {
        frequencyMap = new FrequencyMap();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        frequencyMap=null;
    }

    @Test
    public void checkFrequency() {
        String[] inputArray = {"a","b","c","d","a","c","c"};
        Map<String, Boolean> expectedMap= new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        Map<String, Boolean> resultingMap= frequencyMap.checkFrequency(inputArray);

        assertTrue("checkFrequency is failing", expectedMap.equals(resultingMap));
    }

    @Test
    public void checkFrequencyFailure() {
        String[] inputArray = {"a","b","c","d","a","c","c"};
        Map<String, Boolean> expectedMap= new HashMap<String, Boolean>();
        expectedMap.put("a",false);
        expectedMap.put("b",false);
        expectedMap.put("c",false);
        expectedMap.put("d",false);
        Map<String, Boolean> resultingMap= frequencyMap.checkFrequency(inputArray);

        assertFalse("checkFrequencyFailure is failing", expectedMap.equals(resultingMap));
    }

    @Test
    public void checkForNullInput()
    {
        String[] inputArray = {};
        Map<String, Boolean> expectedMap= new HashMap<String, Boolean>();
        Map<String, Boolean> resultingMap= frequencyMap.checkFrequency(inputArray);
        assertTrue("checkFrequency is failing", expectedMap.equals(resultingMap));
    }
}