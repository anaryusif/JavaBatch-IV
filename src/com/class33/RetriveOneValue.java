package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveOneValue {

	public static void main(String[] args) {
		Set <String> cars=new LinkedHashSet<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Kia");
        cars.add("Honda");
        cars.add("Mazda");
     List <String> list=new ArrayList<>(cars);
 System.out.println(cars);
	}

}
