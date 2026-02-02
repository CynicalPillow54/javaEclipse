package oop.inheritance.challenge;

import oop.inheritance.challenge.Car;
import oop.inheritance.challenge.FamilySaloon;
import oop.inheritance.challenge.RallyCar;
import oop.inheritance.challenge.F1;
import java.util.Scanner;
import java.lang.UnsupportedOperationException;

public class CarFactory {

	public static void main(String[] args) {
		FamilySaloon audiA3 = new FamilySaloon("Audi", "A3", 130, true);
		F1 ferrari = new F1("Ferrari", "Maranello", 2330, 1.24);
		F1 mclaren = new F1("McLaren", "MCL2016", 2320, 1.12);
		RallyCar subaru = new RallyCar("Subaru", "Impreza", 143, 1.98);
		FamilySaloon subaruFs = new FamilySaloon("Subaru", "Legacy", 123, false);
		
		Car[] carFactory = {
				audiA3,
				ferrari,
				mclaren,
				subaru,
				subaruFs
		};
		
		// Print all cars
		System.out.println("All Cars\n");
		for (Car car : carFactory) {
			car.displayAll();
			System.out.println();
		}
		
		// Print least HP model
		String leastHPmodel = leastHpCalc(carFactory);
		System.out.println("Least HP model: "+leastHPmodel);
		
		
		// Output all details of car(s) of make
		System.out.println();
		System.out.println("Choose Make:\n[1] Audi\n[2] Ferrari\n[3]Mclaren\n[4]Subaru");
		
		String[] makeArray = {"Audi", "Ferrari", "Mclaren", "Subaru"};
		int userChoice;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Choice: ");
			userChoice = sc.nextInt();
			if (userChoice >= 1 && userChoice <= 4) {
				
				
				String makeChoice = makeArray[userChoice-1];
				displayDetailsMake(makeChoice, carFactory);
				sc.close();
			} else {
				sc.close();
				throw new UnsupportedOperationException();
			}
			
		} catch (UnsupportedOperationException ex) {
			System.out.println("Please pick from 1 - 4");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		//Output average HP for all cars
		
		double hpCalc = calculateAverageHp(carFactory);
		System.out.printf("\nAverage horsepower of all cars = %.2f", hpCalc);
		
	}

	private static double calculateAverageHp(Car[] carFactory) {
		double result;
		
		int totalCars = carFactory.length;
		int totalHp = 0;
		
		for (Car car : carFactory) {
			totalHp += car.getHorsePower();
		}
		
		result = (double) totalHp / totalCars;
		
		return result;
	}

	private static void displayDetailsMake(String make, Car[] carFactory) {
		
		for (Car car : carFactory) {
			if (car.getMake().equalsIgnoreCase(make)) {
				System.out.println();
				car.displayAll();
			}
		}
	}

	private static String leastHpCalc(Car[] carFactory) {
		String result = null;
		int hp = 10000;
		
		for (Car car : carFactory) {
			if (car.getHorsePower() < hp) {
				hp = car.getHorsePower();
				result = car.getModel();
			}
		}
		
		return result;
	}

}
