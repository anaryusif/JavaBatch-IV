package com.class22;

public class task2 {
String name;
int sub1;
int sub2;
int sub3;
public void average() {int average=(sub1+sub2+sub3)/3;
System.out.println(average);
}

public task2(String names, int subs1, int subs2, int subs3){
	name=names;
	sub1=subs1;
	sub2=subs2;
	sub3=subs3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       task2 input=new task2 ("Anar", 60, 70, 80);
       input.name="Adam";
       input.sub1=50;
       input.sub2=40;
       input.sub3=100;
       input.input2();
     
       
	}

}
