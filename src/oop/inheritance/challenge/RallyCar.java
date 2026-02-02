package oop.inheritance.challenge;

import oop.inheritance.challenge.Car;

public class RallyCar extends Car{
	
	private static final String TYPE = "Rally Car";
	private static final String FORMATF = "%-16s:%.2f%n";
	
	private double area;
	
	
	public RallyCar(String make, String model, int horsePower, double area) {
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


}
