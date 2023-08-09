package com.engineering.tryout;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        //int[] array = {6, 5, 4, 3, 2, 1};
        int n = array.length;

        int elementToFind = 1;
        //linear search => O(n)
        linearSearch(array, n, elementToFind);

        //make sure array is sorted for binary search
        if (array[1] > array[0]) {
            //ascending sorted
            System.out.println("Found at " + findElementUsingBinarySearch(array, n, elementToFind));
        }
        else if (array[n-1] < array[n-2]) {
            //reverse sorted or descending sorted
            System.out.println("Found at " + findElementUsingBinarySearchDescending(array, n, elementToFind));
        }
        else {
            System.out.println("Cannot apply binary search");
        }
    }

    private static int findElementUsingBinarySearch(int[] array, int n, int elementToFind) {
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == elementToFind) {
                return mid;
            } else if (array[mid] > elementToFind) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int findElementUsingBinarySearchDescending(int[] array, int n, int elementToFind) {
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == elementToFind) {
                return mid;
            } else if (array[mid] < elementToFind) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static void linearSearch(int[] array, int n, int elementToFind) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == elementToFind) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found at " + index);
        }
        else {
            System.out.println("Not Found");
        }
    }
}
