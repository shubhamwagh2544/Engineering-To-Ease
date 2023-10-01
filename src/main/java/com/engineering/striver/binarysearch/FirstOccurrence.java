package com.engineering.striver.binarysearch;

public class FirstOccurrence {          //lower bound
    public static void main(String[] args) {
        int[] array = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;

        getFirstOccurrence(array, 0, array.length-1, target);
    }

    private static void getFirstOccurrence(int[] array, int low, int high, int target) {
        int ans = array.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] >= target) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        if (ans == array.length || array[ans] != target) System.out.println(-1);
        else System.out.println(ans);
    }
}
