package oop.inheritance.challenge;

import oop.inheritance.challenge.Car;

public class FamilySaloon extends Car {
	
	private static final String TYPE = "Family Saloon";
	private static final String FORMATB = "%-16s:%b%n";
	
	private boolean metallicPaint;
	
	
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make, model, horsePower);
		this.metallicPaint = metallicPaint;
	}


	public boolean getMetallicPaint() {
		return metallicPaint;
	}


	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	
	@Override
	public void displayAll() {
		System.out.println(TYPE);
		super.displayAll();
		System.out.printf(FORMATB, "Metallic Paint", this.getMetallicPaint());
		
	}
	
}
