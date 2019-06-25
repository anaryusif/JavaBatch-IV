package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

import com.class2.names;

public class task {

	public static void main(String[] args) {
	ArrayList<String> names=new  ArrayList<String>();
	names.add("Anar");
	names.add("AliJohn");
	names.add("DenisJohn");
	names.add("Aygerim");
	names.add("Nastiya");
	System.out.println(names.isEmpty());
	System.out.println(names.contains("Anar"));
	System.out.println(names.size());
		
	
	for (String name:names){
System.out.println(name);		
	}
ArrayList alist=new ArrayList();
alist.add("String");
alist.add(17);
alist.add(17.13);
//we can store anything we want.
for (Object value:alist) {
	System.out.println(value);
}
	Iterator <String> it=names.iterator();
	//boolean check=it.hasNext();
	//System.out.println(it.hasNext());
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	}

}
