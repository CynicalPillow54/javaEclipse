package arrays.lectureActivities;


import java.util.Arrays;

public class ex2 {
    public static void main (String[] args){
        int[][] twoDArray = new int[4][3];
        int multiplier = 2;

        for (int row = 0; row < twoDArray.length; row++){
            for (int cell = 0; cell < twoDArray[row].length; cell++){
                twoDArray[row][cell] = twoDArray[row][cell] + multiplier;
                multiplier += 2;
            }
            System.out.println(Arrays.toString(twoDArray[row]));
        }
    }
}
