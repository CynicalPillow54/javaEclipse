package oop.inheritance.challenge;

import oop.inheritance.challenge.Car;

public class F1 extends Car{
	
	private static final String TYPE = "F1";
	private static final String FORMATF = "%-16s:%.2f%n";
	
	private double area;
	
	
	public F1(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void displayAll() {
		System.out.println(TYPE);
		super.displayAll();
		System.out.printf(FORMATF, "Area", this.getArea());
		
	}
	
	@Override
	protected int validateHorsePower(int horsePower) {
		int validHP;
		if (horsePower >= 0 && horsePower <= 3000) {
			validHP = horsePower;
		} else {
			validHP = -999;
		}
		
		return validHP;
	}



}
