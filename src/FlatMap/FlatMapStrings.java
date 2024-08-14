package FlatMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a map where the keys are the strings and the values are lists of strings,
//flatten the map to get a single stream of all the strings.
public class FlatMapStrings {
    public static void main(String[] args) {
        Map<String, List<String>> mapString = new HashMap<>();
        mapString.put("fruits",List.of("apple","banana","cherry"));
        mapString.put("vegetable",List.of("tomato","carrot","potato"));
        mapString.put("grains",List.of("rice","wheat","corn"));

        List<String> flattendList = mapString.values().stream()
                .flatMap(List::stream).toList();

        System.out.println(flattendList);

    }
}
