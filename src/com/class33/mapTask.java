package com.class33;

import java.util.*;

public class mapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<Integer, String> building=new HashMap<>();
 building.put(1, "Google");
 building.put(2, "Google");
 building.put(3, "Yahoo");
 building.put(3, "Google");
 building.put(4, "Sytax");
 building.put(5, "Appple");
 building.put(6, "Sybernow");
 System.out.println(building);
 building.size();
 System.out.println(building.size());
 building.put(4, "Amazon");
 building.remove(4);
 System.out.println(building);
 building.keySet();
 System.out.println(building.keySet());
	}
 
}
