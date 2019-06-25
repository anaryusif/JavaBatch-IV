package com.class33;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class taskList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=new ArrayList<String>();
names.add("John");
names.add("Johny");
names.add("Johno");
names.add("John");
names.add("John");


for (String element : names) { 
	   if (!names.contains(element)) { 
       
System.out.println(names.add(element));
	}}
Set <String> dublicates=new HashSet<>(names);
System.out.println(dublicates);

}}
