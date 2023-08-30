package com.engineering.striver.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 7, 9, 12, 16, 17};

        int target = 17;
        int low = 0;
        int high = array.length - 1;

        Found foundOrNot = iterativeWay(array, low, high, target);
        System.out.println(foundOrNot.message);

        Found foundOrNot2 = recursiveWay(array, low, high, target);
        System.out.println(foundOrNot2.message);
    }

    private static Found recursiveWay(int[] array, int low, int high, int target) {
        if (low > high) {
            return new Found(String.format("%s not found in array", target));
        }

        int mid = (low + high) / 2;
        if (array[mid] == target) return new Found(String.format("%s found at %s", target, mid));
        else if (target > array[mid]) return recursiveWay(array, mid+1, high, target);
        else return recursiveWay(array, low, mid-1, target);
    }

    private static Found iterativeWay(int[] array, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) return new Found(String.format("%s found at %s", target, mid));
            else if (target > array[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return new Found(String.format("%s not found in array", target));
    }
    record Found(String message) {}
}
