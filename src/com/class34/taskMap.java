package com.class34;

import java.util.*;

public class taskMap {

	public static void main(String[] args) {
String[] city={"Baku", "Istanbul", "Paris"};

Map<String, Integer> mapCity=new TreeMap<>();

for (String name:city) {
int key=name.length();
	if (key<7)
	mapCity.put(name, key);
		}
System.out.println(mapCity);
Iterator<Map.Entry<String, Integer>> it=mapCity.entrySet().iterator();
while(it.hasNext()) {
Map.Entry<String,Integer> entry=it.next();
if (entry.getValue()>7) {
	it.remove();
}
}
System.out.println(mapCity);
	}
}
