package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayCalculatorTest {

    @Test
    public void calCalendar() {
        DayCalculator dc= new DayCalculator();
        String [] ExpectedStr={"Mon 31/12/2018","Sun 06/01/2019"};

        assertArrayEquals("DayCalculator is failing ",dc.calCalendar(),ExpectedStr);
    }
}