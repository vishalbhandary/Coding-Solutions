package ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;

// You have a list of strings that need to be printed in uppercase.
//However, you also want to maintain the original order of the strings.
//Implement this using parallel streams.
public class MaintainOrderAndUppercase {
    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana","cherry","date");
        List<String> uppercaseList = stringList.parallelStream()
                .map(String::toUpperCase).toList();
        uppercaseList.forEach(System.out::println);
    }
}
