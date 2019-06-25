package com.class28;


public abstract class taskAbs {
 String name;
 String address;
 long telNum;
 String vehicleType;

public abstract String  getVehicleType ();
public abstract String getName ();
public abstract String getAddress ();
public abstract long getTelNum ();
public abstract String getStipend ();


public class Secretary extends taskAbs {

	public Secretary() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getVehicleType() {
		return super.vehicleType;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.name;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.address;
	}

	@Override
	public long getTelNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStipend() {
		// TODO Auto-generated method stub
		return null;
	}}}

	