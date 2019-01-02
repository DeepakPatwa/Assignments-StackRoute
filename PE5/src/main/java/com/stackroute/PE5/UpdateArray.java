package com.stackroute.PE5;


public class UpdateArray {
    public String[] replaceArrayElement(String[] arrayString, String element, String replacingString)
    {
        if(replacingString==null)
            replacingString="";

        if(arrayString.length==0)
            return arrayString;

        for(int i=0;i<arrayString.length;i++)
        {
            if (arrayString[i].equals(element))
            {
                arrayString[i]=replacingString;
                break;
            }
        }
        return arrayString;
    }

    public String[] clearArray(String[] StringArray)
    {
        StringArray=null;
        return StringArray;
    }
}