package com.engineering.algoexpert.easy;

public class ValidateSubsequence {
    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] subsequence = {1, 6, -1, 10};

        isValidSubsequence(array, subsequence);
    }

    private static void isValidSubsequence(int[] array, int[] subsequence) {
        int arrayLength = array.length;
        int subsequenceLength = subsequence.length;

        int i = 0;
        int j = 0;

        while (i < arrayLength && j < subsequenceLength) {
            if (array[i] == subsequence[j]) {
                j++;
            }
            i++;
        }

        if (j != subsequenceLength) {
            System.out.println("Not Subsequence");
        }
        else {
            System.out.println("Subsequence");
        }
    }
}
