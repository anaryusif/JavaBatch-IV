package com.class31;

import java.util.ArrayList;

public class car {
public static void main(String[] args) {
	ArrayList <String> cars=new ArrayList <String>();
	cars.add("BMW");
	cars.add("Audo");
	cars.add("Kia");
	cars.add("Nissan");
	
	for (String car:cars) {
		System.out.println(car);
		}
	for (int i=0; i<cars.size(); i++) {
		System.out.println(cars.get(i));
	}
}
}
