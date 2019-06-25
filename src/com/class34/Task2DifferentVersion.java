package com.class34;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2DifferentVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> emp=new HashMap<>();
        emp.put("John", 10000);
        emp.put("Denis", 90000);
        emp.put("Anar", 350000);
        int maxSalary=0;
        String key=null;
        for (Map.Entry<String, Integer> entry: emp.entrySet()) {
        	if (entry.getValue()>maxSalary){
        		maxSalary=entry.getValue();
        		key=entry.getKey();
        		
        	}
        	System.out.println(maxSalary+" belongs "+ key);
        }
	}

}
