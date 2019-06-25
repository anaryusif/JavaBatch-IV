package com.class33;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;




public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> classDays=new LinkedHashSet<>();
        classDays.add("Tuesday");
        classDays.add("Wednesday");
        classDays.add("Thursday");
        classDays.add("Saturday");
        classDays.add("Sunday");
        
        Set<String> num=new HashSet<>();
        num.add("first");
        num.add("second");
        num.add("third");
        num.add("fourth");
        num.add("fifth");
        System.out.println(num);
        num.remove("second");
        System.out.println(num);
        num.clear();
        System.out.println(num);
        
        Set<Integer> num=new HashSet<>();
       
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(999);
        num.add(999);
        num.add(999);
        
        for (int numbers:num){
          System.out.println(numbers);
                 } 
       boolean removednum=num.remove(111);
        System.out.println(removednum);
        
	for (String obj:classDays){
	System.out.println(obj);
	}
System.out.println("_____________________________");
Iterator<String> it=classDays.iterator();
while (it.hasNext()) {
	System.out.println(it.next());
}
}}

