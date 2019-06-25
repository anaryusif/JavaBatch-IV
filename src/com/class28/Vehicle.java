package com.class28;

public abstract class Vehicle {
static int vehiclecount;
Vehicle(){
	vehiclecount++;
}

public abstract void start();
public abstract void drive();
public void stop() {
	System.out.println("Stop Vehicle by pressing break");
}

}

abstract class Car extends Vehicle{
	
}
class BMW extends Car{

	@Override
	public void start() {
		System.out.println("BMW car starts remore");	
	}
	@Override
	public void drive() {
	System.out.println("Bmw car drives fast");	
		
	}
	
}
class Toyota extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Toyota cars starts with push button");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Toyota drives safe");
	}
	
}