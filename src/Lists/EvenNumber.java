package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,4,5,6,8,9,0);

        List<Integer> evenNum = findEven(list);
        System.out.println("Even Number: "+evenNum);
    }
    public static List<Integer> findEven(List<Integer> list){
        return list.stream().filter(num -> num%2 == 0)
                .collect(Collectors.toList());
    }
}
