package arrays.lectureActivities;

public class ex1 {
    public static void main (String[] args){
        //Store shoe sizes in double[]
        double[] shoeArray = {11, 10, 10, 9, 11, 9, 11, 8.5};

        // init total variable
        double total = 0;

        // Print shoe sizes to console
        for (int i = 0; i < shoeArray.length; i++){
            System.out.printf("Shoe index: %d, Shoe size: %.2f%n", i, shoeArray[i]);
            total += shoeArray[i];
        }

        // Calculate average of shoe size
        double average = total / shoeArray.length;

        // Print average
        System.out.printf("Average shoe size: %.2f%n", average);
    }

}
