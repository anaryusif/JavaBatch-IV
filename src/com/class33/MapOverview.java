package com.class33;

import java.util.*;

public class MapOverview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> maps=new HashMap<>();
maps.put(106, "John");
maps.put(102, "Jane");
maps.put(103, "Jane");
maps.put(104, "Jane");
System.out.println(maps);
System.out.println(maps.get(104));
System.out.println(maps.size());
maps.replace(104, "Anar");
System.out.println(maps.get(104));
maps.remove(101);
System.out.println(maps.size());
	}

}
