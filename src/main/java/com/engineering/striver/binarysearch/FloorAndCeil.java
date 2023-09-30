package com.engineering.striver.binarysearch;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 8, 9};
        int target = 5;

        getFloor(array, 0, array.length-1, target);
        getCeil(array, 0, array.length-1, target);
    }

    private static void getCeil(int[] array, int low, int high, int target) {
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] >= target) {
                ans = array[mid];
                high = mid-1;
            }
            else low = mid+1;
        }

        System.out.println("Ceil : " + ans);
    }

    private static void getFloor(int[] array, int low, int high, int target) {
        int ans = Integer.MIN_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] <= target) {
                ans = array[mid];
                low = mid+1;
            }
            else high = mid-1;
        }

        System.out.println("Floor : " + ans);
    }
}
