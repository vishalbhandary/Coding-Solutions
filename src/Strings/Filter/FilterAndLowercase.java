package Strings.Filter;

import java.util.Arrays;
import java.util.List;

//Given an array of strings, filter out all strings that contain a specific substring
//and then convert the remaining strings to lowercase
public class FilterAndLowercase {
    public static void main(String[] args) {
        String[] words = {"Hello", "Java", "JavaSpringBoot", "StreamsAndCollections", "JavaProgramming"};
        String substring = "Java";

        List<String> result = Arrays.stream(words)
                .filter(word -> word.contains(substring))
                .map(String::toLowerCase).toList();
        System.out.println("Final Result is: "+result);

    }

}
