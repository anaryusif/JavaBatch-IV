package com.class34;

import java.util.*;

public class MapFromArray {

	public static void main(String[] args) {
		String[] names={"Adam", "Asha", "Denis"};
		Map<Integer, String> nameMap= new LinkedHashMap<>();
		int key=1;
		for (String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);

	}

}
