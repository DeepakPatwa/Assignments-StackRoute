package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PlayWithMapTest {

    PlayWithMap playWithMap;

    @org.junit.Before
    public void setUp() throws Exception {
        playWithMap = new PlayWithMap();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        playWithMap=null;
    }
    @Test
    public void mapPlay() {
        Map<String, String> inputMap=new HashMap<>();
        inputMap.put("val1","java");
        inputMap.put("val2","c++");
        Map<String, String> expectedMap=new HashMap<>();
        expectedMap.put("val1", " ");
        expectedMap.put("val2", "java");
        Map<String, String> resultingMap=playWithMap.mapPlay(inputMap);

        assertTrue(expectedMap.equals(resultingMap));
    }

    @Test
    public void mapPlayFailure() {
        Map<String, String> inputMap=new HashMap<>();
        inputMap.put("val1","java");
        inputMap.put("val2","c++");
        Map<String, String> expectedMap=new HashMap<>();
        expectedMap.put("val1","java");
        expectedMap.put("val2","c++");
        Map<String, String> resultingMap=playWithMap.mapPlay(inputMap);

        assertFalse(expectedMap.equals(resultingMap));
    }

    @Test
    public void mapPlayNullInput() {
        Map<String, String> inputMap=new HashMap<>();
        Map<String, String> resultingMap=playWithMap.mapPlay(inputMap);

        assertNull(resultingMap);
    }
}