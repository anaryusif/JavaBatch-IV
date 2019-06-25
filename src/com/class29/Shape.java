package com.class29;

public interface Shape {
void calculateArea( double c);
void calculatePerimiter(int r);
}
class Circle implements Shape {

	@Override
	public void calculateArea(  double c) {
		double b =3.14;
		double a;
		a=b*(c*c);
		System.out.println(a+" area of circle");
		
	}

	@Override
	public void calculatePerimiter(int r) {
		double c=3.14;
		double a;
		a=2*c*r;
		System.out.println(a+" perimeter of circle");
		
	}
	
}
class Square  implements Shape{

	@Override
	public void calculateArea(double c) {
		// TODO Auto-generated method stub
		double squre=c*c;
		System.out.println(squre+" are of square");
		
	}

	@Override
	public void calculatePerimiter(int r) {
		// TODO Auto-generated method stub
		int a=4*r;
		System.out.println(a+" perimeter of square");
	}
	
}
class test{
	public static void main(String[] args) {
		Shape obj=new Square();
		obj.calculateArea(2.4);
	}
}