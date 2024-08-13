package Arrays.ReductionAndCalculation;

import java.util.Arrays;

//Given an array of integers, find the maximum and minimum
//values using streams
public class MaxAndMin {
    public static void main(String[] args){
        int[] numbers = {15,29,98,56,48,72};
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }
}
