package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given an array of lists of integers, flatten the structure
//to obtain a single stream of all the integers.
public class FlatMapIntegers {
    public static void main(String[] args) {
        List<Integer>[] arrayOfLists = new List[]{
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        };
        List<Integer> flattendList = Arrays.stream(arrayOfLists)
                .flatMap(List::stream).toList();
        System.out.println(flattendList);
    }
}
