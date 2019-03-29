package com.reveiw;

import java.util.Scanner;

public class mywork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	Scanner coin=new Scanner (System.in);
    System.out.println("how many dimes you have?");
    int dimes=coin.nextInt();
    System.out.println("how many quarters you have");
    int quarter=coin.nextInt();
    System.out.println("how many dollars you have?");
    float dollar=coin.nextFloat();
    double dimesr=dimes*5/100;
    double quarterr=quarter*25/100;
    
   
   double money=dimesr+quarterr+dollar;
   
    System.out.println(money);
	}

}
