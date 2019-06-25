package com.class33;

import java.util.*;

public class bestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> items=new HashMap<>();
items.put(21321312, "TV");
items.put(656456, "Laptop");
System.out.println(items);
Set<Integer> keySet=items.keySet();
System.out.println(keySet);
Iterator<Integer> keyy=items.keySet().iterator(); 
while (keyy.hasNext())	{
	keyy.hasNext();
	System.out.println(keyy.next());
}

for (int key:keySet) {
	System.out.println(key);
}

	}

}
