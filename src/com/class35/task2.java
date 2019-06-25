package com.class35;

import java.util.*;

public class task2 {

	public static List<Exception> getList(){
		
		List<Exception> list=new ArrayList<>();
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			list.add(e);
			
		}
		
		return null;
		
		
	}}
			