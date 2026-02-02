package oop.inheritance.challenge;

public class Car {
	
	private static final String FORMATS = "%-16s:%s%n";
	private static final String FORMATD = "%-16s:%d%n";
	
	private String make;
	private String model;
	private int horsePower;
	
	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {
		super();
		this.make = make;
		this.model = model;
		this.horsePower = validateHorsePower(horsePower);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = validateHorsePower(horsePower);
	}

	protected int validateHorsePower(int horsePower) {
		int validHP;
		if (horsePower >= 0 && horsePower <= 1000) {
			validHP = horsePower;
		} else {
			validHP = -999;
		}
		
		return validHP;
	}
	
	public void displayAll() {
		System.out.printf(FORMATS, "Make", this.getMake());
		System.out.printf(FORMATS, "Model", this.getModel());
		System.out.printf(FORMATD, "Horsepower", this.getHorsePower());
		
	}
	
	

}
