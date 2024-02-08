package com.engineering.challenges.binarysearch;

public class SearchInsertPosition {     //UpperBound or Ceil
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6};
        int target = 3;

        searchInsertPosition(array, 0, array.length-1, target);
    }

    private static void searchInsertPosition(int[] array, int low, int high, int target) {
        int ans = array.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] >= target) {
                ans = mid;
                high = low-1;
            }
            else low = mid+1;
        }

        System.out.println(ans);
    }
}
