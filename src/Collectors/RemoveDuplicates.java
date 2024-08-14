package Collectors;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//Given an array of strings, collect them into set to remove duplicates
public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] array = {"apple", "banana","apple","cherry","banana"};

        Set<String> result = Arrays.stream(array).collect(Collectors.toSet());

        System.out.println(result);
    }
}
