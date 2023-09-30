package com.engineering.striver.binarysearch;

/*
        Upper Bound : index such that array[index] >= target
        if NOT FOUND, print N (array size)
 */
public class UpperBound {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 15, 19};
        int n = array.length;
        int target = 9;

        getUpperBound(array, 0, n-1, target);
    }

    private static void getUpperBound(int[] array, int low, int high, int target) {
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

        int element = ans==array.length ? Integer.MAX_VALUE : array[ans];
        System.out.println(element + " found at index " + ans);
    }
}
