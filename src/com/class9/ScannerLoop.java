package com.class9;

import java.util.Scanner;

public class ScannerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int start=0;
int end=0;
Scanner input=new Scanner (System.in);
System.out.println("please enter start point");
start=input.nextInt();
System.out.println("enter end point");
end=input.nextInt();
if (start<end) {
for (int i=start; i<end; i++) {	
	
   if(i%2==0) {
	   
	   System.out.println(i);
   }
}
}}}


