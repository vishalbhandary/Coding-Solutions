package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxValue {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,20,30,5,50);

        int max = findMax(list);
        System.out.println("Maximum value: "+max);
    }
    public static int findMax(List<Integer> list){
        return list.stream().max(Integer::compareTo)
                .orElseThrow(NoSuchElementException::new);
    }
}
