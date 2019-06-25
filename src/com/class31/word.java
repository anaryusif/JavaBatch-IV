package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> words=new ArrayList <String>();
		words.add("done");
		words.add("do");
		words.add("what");
		words.add("prettie");
	Iterator<String> word=words.iterator();
	while (word.hasNext()) 
        if (word.next().endsWith("e")) {
        	word.remove();
        	System.out.print(word.hasNext());
        }
	
		}	
}