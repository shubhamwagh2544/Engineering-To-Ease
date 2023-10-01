package com.engineering.striver.binarysearch;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] array = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;

        countOccurrence(array, target);
    }

    private static void countOccurrence(int[] array, int target) {
        int lb = getFirst(array, 0, array.length-1, target);
        int ub = getLast(array, 0, array.length-1, target);

        if (lb != -1 && ub != -1) System.out.println(ub - lb + 1);
        else System.out.println(0);
    }

    private static int getLast(int[] array, int low, int high, int target) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                ans = mid;
                low = mid+1;
            }
            else if (array[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return ans;
    }

    private static int getFirst(int[] array, int low, int high, int target) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                ans = mid;
                high = mid-1;
            }
            else if (array[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return ans;
    }
}
