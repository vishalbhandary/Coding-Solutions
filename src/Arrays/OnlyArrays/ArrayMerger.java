package Arrays.OnlyArrays;

import java.util.Arrays;

public class ArrayMerger {
    public static void main(String[] args){
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};

        int[] mergedArray = mergedSortArray(a,b);
        System.out.println("Merged Array is: "+ Arrays.toString(mergedArray));
    }

    public static int[] mergedSortArray(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i<a.length && j<b.length){
            if(a[i] <= b[j]){
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }
        while(i<a.length)
            res[k++] =a[i++];
        while(j<b.length)
            res[k++] =b[j++];
        return res;
    }
}
