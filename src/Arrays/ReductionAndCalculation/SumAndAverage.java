package Arrays.ReductionAndCalculation;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

//Given an array of numbers, calculate the sum and average
//of all elements using streams
public class SumAndAverage {
    public static void main(String[] args){
        int[] numbers = {10,20,50,30,70};
        int sum = Arrays.stream(numbers).sum();
        OptionalDouble average = Arrays.stream(numbers).average();
        System.out.println("sum is: " +sum);
        System.out.println("average is: "+average);

    }
}
