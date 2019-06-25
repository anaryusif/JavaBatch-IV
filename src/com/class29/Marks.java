package com.class29;

public abstract class Marks {
abstract double getPercentage();
}
class A extends Marks{
	int mark1, mark2,mark3;
	A(int mark1, int mark2, int mark3){
	this.mark1=mark1;
	this.mark2=mark2;
	this.mark3=mark3;
	}
	@Override
	double getPercentage() {
		double perc=(mark1+mark2+mark3)/3;
	    return perc;
		
	}
	
}
class B extends Marks{

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}