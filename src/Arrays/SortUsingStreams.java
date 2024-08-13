package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class SortUsingStreams {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 9, 11, 15));
//        List<Integer> sortedListAscending = list.stream().sorted().toList();
//        System.out.println("Ascending: "+sortedListAscending);
//        List<Integer> sortedListDescending = list.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println("Descending: "+sortedListDescending);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = sc.nextLine();
        String[] numberStrings = input.split(" ");
        List<Integer> numbers = Arrays.stream(numberStrings)
                                        .map(Integer::parseInt).toList();

        List<Integer> sortedListAscending = numbers.stream().sorted().toList();
        System.out.println("Ascending: "+sortedListAscending);
        List<Integer> sortedListDescending = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending: "+sortedListDescending);

    }
}