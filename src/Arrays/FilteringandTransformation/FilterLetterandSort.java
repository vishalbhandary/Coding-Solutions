package Arrays.FilteringandTransformation;

//Given an array of strings, filter out all strings that start with a
//specific letter and then sort the remaining strings alphabetically

import java.util.Arrays;
import java.util.List;

public class FilterLetterandSort {
    public static void main(String[] args){
        String[] words = {"apple", "banana", "grapes", "cherry","avocado","almond"};
        char specificLetter = 'a';
        List<String> result = Arrays.stream(words)
                .filter(word -> !word.startsWith(String.valueOf(specificLetter)))
                .sorted().toList();
        System.out.println(result);
    }
}
