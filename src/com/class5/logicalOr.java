package com.class5;

public class logicalOr {

	 
    /*we have 7 days a week
     * if days are from 1-5 --> weekday
     * if days are from 6-7 -->weekend
     * otherwise "Not a valid day"
     */
	public static void main(String[] args) {
	int day=3;
    //    false OR false OR false OR false Or True -->true
    if (day==1 || day==2 || day==3 || day==4 || day==5) {
        System.out.println("It is a weekday");
    //     false OR false -->False
    }else if (day==6 || day==7){
        System.out.println("It is a weekend");
    }else {
        System.out.println("Not a valid day");
    }
    
}
}


