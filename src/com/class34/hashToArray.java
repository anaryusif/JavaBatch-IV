package com.class34;

import java.util.*;

public class hashToArray {

	public static void main(String[] args) {
		 Set<String> s = new HashSet<String>(); 
	        s.add("Geeks"); 
	        s.add("for"); 
	  
	        int n = s.size(); 
	        String arr[] = new String[n]; 
	  
	        int i = 0; 
	        for (String x : s) 
	            arr[i++] = x; 
	  
	        System.out.println(Arrays.toString(arr)); 

	}

}
