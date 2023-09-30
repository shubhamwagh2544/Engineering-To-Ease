package com.engineering.striver.binarysearch;

/*
        Lower Bound : index such that array[index] <= target
        if not found, print -1
 */
public class LowerBound {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 15, 19};
        int n = array.length;
        int target = 1;

        getLowerBound(array, 0, n-1, target);
    }

    private static void getLowerBound(int[] array, int low, int high, int target) {
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] <= target) {
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        int element = ans == -1 ? Integer.MIN_VALUE : array[ans];
        System.out.println(element + " found at index " + ans);
    }
}
