package com.class33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treegtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> classDays=new TreeSet<>();
        classDays.add("Tuesday");
        classDays.add("Wednesday");
        classDays.add("Thursday");
        classDays.add("Saturday");
        classDays.add("Sunday");
        
	for (String obj:classDays){
	System.out.println(obj);
	}
System.out.println("_____________________________");
Iterator<String> it=classDays.iterator();
while (it.hasNext()) {
	System.out.println(it.next());
}
}}
