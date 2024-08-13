package Arrays.FirstOccurence;
//Given a list of integers, sort them in ascending order
//and then remove any duplicates, keeping only the 
//first occurrences of each unique number

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesandKeepOccurence {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,5,3,2,1,3,4,5,7,8,7);
        List<Integer> sortedUniqueNumbers = numbers.stream().sorted().distinct().toList();
        System.out.println(sortedUniqueNumbers);

    }
}
