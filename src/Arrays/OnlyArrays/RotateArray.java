package Arrays.OnlyArrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; //my array
        int k = 1;                  //number of steps to rotate

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArray(arr, k);
        System.out.println("After Rotate by " + k + " steps: " + Arrays.toString(arr));
    }
        public static void rotateArray(int[] arr, int k){
            k %= arr.length;
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
        }
        private static void reverse(int[] arr, int start, int end){
            while( start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    }
