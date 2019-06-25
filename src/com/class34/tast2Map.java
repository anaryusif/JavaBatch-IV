package com.class34;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;

public class tast2Map {

	public static void main(String[] args) {
		Map<String, Integer> emp=new LinkedHashMap<>();
        emp.put("John", 10000);
        emp.put("Denis", 1000);
        emp.put("Anar", 350000);
        
        int maxValueInMap=(Collections.max(emp.values()));
        for (Entry<String, Integer> entry : emp.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey()); 
	}
	}
	}}
