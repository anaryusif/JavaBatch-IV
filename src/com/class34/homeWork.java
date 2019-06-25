package com.class34;

import java.util.HashSet;
import java.util.Set;

public class homeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
	}

}
