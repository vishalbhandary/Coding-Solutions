package Arrays;

import java.util.ArrayList;
import java.util.*;

import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,2,5,9,11,15));

 //   Bubble sort technique
//        for(int i=0;i<list.size();i++) {
//            for(int j=i+1;j<list.size();j++) {
//
//                if(list.get(i)>list.get(j)) {
//                    int temp = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, temp);
//                }
//            }
//        }
        List<Integer> sortedList = new ArrayList<>(IntStream.range(0, list.size())
                .mapToObj(i -> list)
                .reduce((a, b) -> {
                    for (int j = 0; j < b.size() - 1; j++) {
                        if (b.get(j) > b.get(j + 1)) {
                            int temp = b.get(j);
                            b.set(j, b.get(j + 1));
                            b.set(j + 1, temp);
                        }
                    }
                    return b;
                })
                .orElse(new ArrayList<>()));
        System.out.println(sortedList);
    }
}
