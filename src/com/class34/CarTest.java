package com.class34;

import java.util.*;

public class CarTest {

	public static void main(String[] args) {
	Car car1=new Car("Toyota","Corolla");	
	Car car2=new Car("Bmw","Corolla");
	Car car3=new Car("MAzda","Corolla");
	Car car4=new Car("MBZ","Corolla");
	Car car5=new Car("Reno","Corolla");
	//car1.printDetails();
	//car2.printDetails();
	//car3.printDetails();
	//car4.printDetails();
	//car5.printDetails();
	Map<Integer, Car> carMap=new HashMap<>();
	//carMap.put(1, 1new Car("Toyota","Corolla");
	carMap.put(1, car1);
	carMap.put(2, car2);
	carMap.put(3, car3);
	carMap.put(4, car4);
	Collection<Car> carValue=carMap.values();
	for (Car car:carValue) {
		car.printDetails();
		
	}
	
	
	}

}
