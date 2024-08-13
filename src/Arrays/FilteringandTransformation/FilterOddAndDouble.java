package Arrays.FilteringandTransformation;

import java.util.Arrays;
import java.util.List;

//Given an array of integers, filter out all even numbers and then
//double each of the remaining odd numbers

public class FilterOddAndDouble {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> result = Arrays.stream(numbers)
                                        .filter(n -> n % 2 != 0)
                                        .map(n -> n * 2)
                                        .boxed()
                                        .toList();
        System.out.println(result);
    }
}

//here array is {1,2,3,4,5,6,7,8,9,10}
//filtered odd number is {1,3,5,7,9}
//Double Odd Number: {2,6,10,14,18} is the final output