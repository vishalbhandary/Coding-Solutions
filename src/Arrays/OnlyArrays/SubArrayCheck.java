package Arrays.OnlyArrays;

public class SubArrayCheck {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 20, 8, 9};
        int[] sub = {20, 8};
        boolean res = isSubArray(arr, sub);
        System.out.println("Is sub array present? "+res);
    }
        public static boolean isSubArray(int[] arr, int[] sub) {
            for (int i = 0; i <= arr.length - sub.length; i++) {
                int j = 0;
                while (j < sub.length && arr[i + j] == sub[j]) {
                    j++;
                }
                if (j == sub.length)
                    return true;
            }
            return false;
        }
}
