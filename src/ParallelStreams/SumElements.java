package ParallelStreams;

import java.util.List;
import java.util.stream.IntStream;

//Given a large list of numbers, calculate the sum of all the elements
//using a parallel stream
public class SumElements {
    public static void main(String[] args) {
        List<Integer> largeList = IntStream.rangeClosed(1, 1000000).boxed().toList();

        int sum = largeList.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: "+sum);
    }
}
