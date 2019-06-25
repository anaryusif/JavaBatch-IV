package com.class26;

public class ThisKeyword {
int num1, num2;
public ThisKeyword(int num1, int num2) {
this.num1=num1;
this.num2=num2;
}
public void sum(int num1, int num2) {
	System.out.println("local "+num1+" "+num2);
	System.out.println("instance "+this.num1+" "+this.num2);
}
public static void main(String[] args) {
	ThisKeyword obj=new ThisKeyword(10, 20);
			obj.sum(100, 200);
}
}
