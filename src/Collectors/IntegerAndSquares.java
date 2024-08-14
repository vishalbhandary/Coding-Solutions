package Collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a stream of integers, collect them into a map
//where the key is the integer and the value is its square
public class IntegerAndSquares {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Map<Integer,Integer> result = numbers.collect(
                Collectors.toMap(
                        i -> i,
                        i->i*i
                )
        );
        System.out.println(result);
    }
}
