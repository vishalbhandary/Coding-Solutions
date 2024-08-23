package Strings;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNonRepeating {
    public static void main(String[] args){
        String str = "swiss";

        Optional<Character> res = firstNonRepeating(str);
        System.out.println("First non-repeating character: "+res.orElse(' '));
    }

    public static Optional<Character> firstNonRepeating(String str){
        return str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey).findFirst();
    }
}
