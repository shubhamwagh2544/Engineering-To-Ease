package com.engineering.challenges.binarysearch;

/*
        Upper Bound : index such that array[index] > target
 */
public class UpperBound {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 15, 19};
        int n = array.length;
        int target = 15;

        getUpperBound(array, 0, n-1, target);
    }

    private static void getUpperBound(int[] array, int low, int high, int target) {
        int ans = array.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] > target) {
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
