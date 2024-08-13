package Maps.FilterAndTransform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a map where the keys are strings and the values are lists of integers,
//transform the map into a new map where the values are the same of the lists.
public class TransformMap {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("apple", List.of(1,2,3));
        map.put("banana", List.of(4,5,6));
        map.put("cherry", List.of(7,8,9));

        Map<String, Integer> sumMap = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry-> entry.getValue().stream().mapToInt(Integer::intValue).sum()));
        
        System.out.println(sumMap);

    }
}
