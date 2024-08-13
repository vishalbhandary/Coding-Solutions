package Strings.GroupingAndCounting;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Given an array of strings, group the strings by their length
//and count the number of strings in each group.
public class GroupAndCount {
    public static void main(String[] args) {
        String[] words = {"apple", "banana","cherry","kiwi","date","fig"};
        Map<Integer, Long> result = Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(result);
    }
}
