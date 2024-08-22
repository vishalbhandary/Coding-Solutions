package Arrays.OnlyArrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int arr[] ={10,5,20,8,12};
        int answer = secondLargest(arr);

        System.out.println("Array -> "+ Arrays.toString(arr));
        System.out.println("The Second Largest number is: " +answer);
    }
    public static int secondLargest(int[] arr) {{
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num < first) {
                    second = num;
                }
            }
            return second;
        }
    }

}
