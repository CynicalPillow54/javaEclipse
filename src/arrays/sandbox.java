package arrays;

public class sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {7, 14, 70, 2, 6};
		int num = 7;
		
		System.out.println(nums[3]);
		add(num);
		System.out.println(num);
		addToArray(nums);
		System.out.println(nums[3]);

	}

	private static void addToArray(int[] theArray) {
		// TODO Auto-generated method stub
		int addToEach = 5;
		for(int i = 0; i < theArray.length; i++) {
			theArray[i] += addToEach;
		}
	}

	private static void add(int num) {
		// TODO Auto-generated method stub
		int addToNum = 15;
		num = addToNum + num;
		
	}

}
