package com.Labbook6;

 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;



 

public class Ex1 {

 

    public static ArrayList<String>getvalues(HashMap<String,String>  capitals)
    {
    	ArrayList<String>keyList = new ArrayList<String>(capitals.keySet());
    	ArrayList<String>valueList = new ArrayList<String>(capitals.keySet());
    	Collections.sort(valueList);
    	return valueList;
    }
    public static void main(String[]args)
    {
    	
        
        HashMap<String,String> capitals = new HashMap<> ();
        capitals.put("India", "New Delhi");
        capitals.put("US", "Washington");
        capitals.put("UK", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");  
        
        ArrayList<String> valueList = getvalues(capitals);
        System.out.println(valueList);
        
        
    }
}
        
        