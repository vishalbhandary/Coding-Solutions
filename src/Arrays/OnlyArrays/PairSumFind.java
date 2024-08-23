package Arrays.OnlyArrays;

import java.util.*;

public class PairSumFind {
    public static void main(String[] args){
        int[] arr = {1,5,7,-1,5};
        int sum = 6;

        List<int[]> pairs = pairsWithSum(arr, sum);
        System.out.println("Array is "+ Arrays.toString(arr));
        System.out.println("Pairs with sum "+sum+" :");
        for(int[] pair: pairs){
            System.out.println(Arrays.toString(pair));
        }
    }
    public static List<int[]> pairsWithSum(int[] arr,int sum){
        Set<Integer> set = new HashSet<>();
        List<int[]> res = new ArrayList<>();

        for(int num : arr){
            int target = sum - num;
            if(set.contains(target)){
                res.add(new int[] {num, target});
            }
            set.add(num);
        }
        return res;
    }
}
