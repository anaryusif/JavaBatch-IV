package com.class33;

import java.util.*;

public class CountriesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map <Integer, String> country=new HashMap<>();
    country.put(1, "Azerbaijan");
    country.put(2, "Moldova");
    country.put(3, "Turkey");
    country.put(4, "Russia");
    System.out.println(country);
    
    country.entrySet();
    System.out.println(country.entrySet());
    for (Map.Entry entry:country.entrySet()) {
    
    System.out.println(entry.getKey()+ ": "+entry.getValue());
    
    }
   }
	  
   }
  
