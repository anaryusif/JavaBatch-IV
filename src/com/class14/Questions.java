package com.class14;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=25;
int y=50;
x=y*x; //50
y=x/y; //60
y=x/y; //10
x=x/y;
System.out.println(x);
System.out.println(y);
String a="Anar";
String b="Bilal";
System.out.println(a.replaceAll("Anar", "Bilal"));
System.out.println(b.replaceAll("Bilal", "Anar"));

int num []= {1000,700,585,658,5090,565,6767,};
int max1=num[0];
int max2=num[1];
for (int i=0; i<num.length;i++) {
	if (max2<num[i]) {
	max2=num[i];
	}
	if (max2>max1) {
		int temp=max1;
		max1=max2;
		max2=temp;
	}
}
System.out.println(max2);
	}}


	