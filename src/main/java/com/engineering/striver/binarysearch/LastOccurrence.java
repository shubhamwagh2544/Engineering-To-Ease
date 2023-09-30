package com.engineering.striver.binarysearch;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] array = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;

        getLastOccurrence(array, 0, array.length-1, target);
    }

    private static void getLastOccurrence(int[] array, int low, int high, int target) {
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] <= target) {
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        System.out.println(ans);
    }
}
