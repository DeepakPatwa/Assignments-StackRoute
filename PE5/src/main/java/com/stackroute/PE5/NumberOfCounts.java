package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCounts {
    public Map<String, Integer> calculateNumberOfCounts(String strInput) {
        Map<String, Integer> countOfStringMap = new HashMap<String, Integer>();

        if(strInput.length()==0)
            return null;

        String alphaOnly = strInput.replaceAll("[@*-_]+", " ");
        String[] alphaOnlyArray = alphaOnly.split(" ");

        for (int i = 0; i < alphaOnlyArray.length; i++) {
            if (countOfStringMap.get(alphaOnlyArray[i]) == null) {
                countOfStringMap.put(alphaOnlyArray[i], 1);
            } else
                countOfStringMap.put(alphaOnlyArray[i], countOfStringMap.get(alphaOnlyArray[i]) + 1);
        }
        return countOfStringMap;
    }
}
