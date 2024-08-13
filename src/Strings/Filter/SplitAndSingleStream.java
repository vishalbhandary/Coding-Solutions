package Strings.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given an array of sentence, split each sentences into words
//and then create a single stream of all the words
public class SplitAndSingleStream {
    public static void main(String[] args){
        String[] sentences = {"This is","an Example","sentences which","needs to be split"};
        List<String> words = Arrays.stream(sentences)
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .toList();
        System.out.println(words);
    }
}
