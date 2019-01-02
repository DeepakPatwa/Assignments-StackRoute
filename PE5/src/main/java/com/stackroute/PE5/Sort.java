package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sort {
    public ArrayList<String> sortNames(String[] inputString)
    {
        ArrayList<String> resultingArrayList=new ArrayList<>();
        if(inputString==null)
            return null;
        if(inputString.length==0 || inputString.length==1){
            resultingArrayList = Arrays.stream(inputString).collect(Collectors.toCollection(ArrayList::new));
            return resultingArrayList;
        }
        TreeSet<String> set=new TreeSet<String>();
        for(int i=0;i<inputString.length;i++)
            set.add(inputString[i]);


        resultingArrayList.addAll(set);
        return resultingArrayList;
    }
}