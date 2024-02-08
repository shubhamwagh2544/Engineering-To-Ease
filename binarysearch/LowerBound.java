package com.engineering.challenges.binarysearch;

/*
        Lower Bound : index such that array[index] >= target
 */
public class LowerBound {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 15, 19};
        int n = array.length;
        int target = 8;

        getLowerBound(array, 0, n-1, target);
    }

    private static void getLowerBound(int[] array, int low, int high, int target) {
        int ans = array.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] >= target) {
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        System.out.println(ans);
    }
}
