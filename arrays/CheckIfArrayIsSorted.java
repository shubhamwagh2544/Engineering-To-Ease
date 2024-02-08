package com.engineering.challenges.arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1};
        int n = array.length;

        //optimal
        //TC : O(N)
        //SC : O(1)
        checkIfArrayIsSorted(array, n);

        //brute
        //TC : O(N^2)
        //SC : O(1)
        checkIfArrayIsSorted1(array, n);
    }

    private static void checkIfArrayIsSorted(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            if (i != 0 && array[i] < array[i-1]) {
                System.out.println("Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }

    private static void checkIfArrayIsSorted1(int[] array, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[i]) {
                    System.out.println("Not Sorted");
                    return;
                }
            }
        }
        System.out.println("Sorted");
    }
}
