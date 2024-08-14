package Maps.GroupCountAndCalculate;

//Given a map where the keys are strings and the values are integers representing ages,
//group the entries by age ranges(ex: 0-18,19-30,31-50,50+)
//and count the number of people in each age range.

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndCount {
    public static void main(String[] args) {
        Map<String, Integer> peopleAges = new HashMap<>();
        peopleAges.put("Anand", 25);
        peopleAges.put("Bhaskar", 12);
        peopleAges.put("Chetan", 8);
        peopleAges.put("Dhinakar", 67);
        peopleAges.put("Elisa", 19);
        peopleAges.put("Faruk", 55);

        Map<String, Long> ageGroups = peopleAges.values().stream()
                .collect(Collectors.groupingBy(age -> {
                    if(age <= 18){
                        return "0-18";
                    } else if (age <= 30) {
                        return "19-30";
                    } else if (age <= 50) {
                        return "31-50";
                    } else {
                        return "50+";
                    }
                },Collectors.counting()));
        System.out.println(ageGroups);

    }
}
