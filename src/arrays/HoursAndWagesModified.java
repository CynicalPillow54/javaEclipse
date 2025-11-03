package arrays;

public class HoursAndWagesModified {
    public static void main (String[] args){
    	// Calculate the salary for an employee
    	// Rate is 10.25/hr 
    	// Output number of hours worked each day, total hours worked in week, and final weekly salary 
    	
    	float rate = 11.5f; 
    	
    	int[] hrsWorked = {8, 7, 9, 7, 4, 7};
    	
    	float[] dailyPay = new float[6];
    	
    	float weeklyPay = 0;
    	
    	String weekDay = "";
    	
    	int totalHrs = 0;
    	
    	// Populate dailyPay 
    	for (int day = 0; day < hrsWorked.length; day++) {
    		int hrs = hrsWorked[day];
    		
    		dailyPay[day] = hrs * rate;
    	}
    	
    	// calculate total weekly pay 
    	for ( int day = 0; day < dailyPay.length; day++) {
    		weeklyPay += dailyPay[day];
    	}
    	
    	// Print hrs worked daily, total in each week, weekly salary 
    	for (int j = 0; j < hrsWorked.length; j++) {
    		switch(j) {
    		case 0:
    			weekDay = "Monday";
    			break;
    		case 1:
    			weekDay = "Tuesday";
    			break;
    		case 2:
    			weekDay = "Wednesday";
    			break;
    		case 3:
    			weekDay = "Thursday";
    			break;
    		case 4:
    			weekDay = "Friday";
    			break;
    		case 5:
    			weekDay = "Saturday";
    			break;
    		}
    		System.out.printf("Hours worked on %s: %d%n", weekDay, hrsWorked[j]);
    		totalHrs += hrsWorked[j];
    	}
    	
    	System.out.println("Total hours worked this week:" + totalHrs);
    	System.out.println("Total pay this week: " + weeklyPay);
    	
    }
}
