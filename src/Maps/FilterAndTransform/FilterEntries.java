package Maps.FilterAndTransform;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Given a map where the keys are strings and the values are integers,
//filter out all entries where the value is less than a certain threshold.
public class FilterEntries {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("cherry", 14);
        map.put("date", 8);
        map.put("fig", 12);

        int threshold = 10;

        Map<String,Integer> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getValue()>= threshold)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);


    }
}
