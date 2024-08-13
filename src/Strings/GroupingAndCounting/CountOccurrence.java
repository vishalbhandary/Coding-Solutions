package Strings.GroupingAndCounting;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Given an array of sentences, count the occurrences of each unique word across all sentences.

public class CountOccurrence {
    public static void main(String[] args) {
        String[] sentences={
                "hello world",
                "world of java",
                "hello form others",
                "java is good"
        };
        Map<String,Long> wordCount = Arrays.stream(sentences)
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println(wordCount);
    }
}
