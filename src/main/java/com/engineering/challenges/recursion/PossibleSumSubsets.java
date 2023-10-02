package com.engineering.challenges.recursion;

import java.util.ArrayList;
import java.util.List;

public class PossibleSumSubsets {
    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        //int[] array = {2, 3, 6, 7};
        int n = array.length;

        int sum = 2;
        //int sum = 7;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        findAllPossibleSumSubsets(index, array, n, 0, sum, list);

        //only one subsequence
        //findOnePossibleSumSubset(index, array, n, 0, sum, list);

        //total count of subsequences
        //System.out.println(findTotalCountOfAllPossibleSubsequences(index, array, n, 0, sum, list));
    }

    private static void findAllPossibleSumSubsets(int index, int[] array, int n, int currentSum, int sum, List<Integer> list) {
        if (index == n) {
            if (currentSum == sum) {
                System.out.println(list);
            }
            return;
        }
        //pick
        list.add(array[index]);
        currentSum += array[index];
        findAllPossibleSumSubsets(index+1, array, n, currentSum, sum, list);

        //not pick
        Integer removed = list.remove(list.size() - 1);
        currentSum -= removed;
        findAllPossibleSumSubsets(index+1, array, n, currentSum, sum, list);

    }

    private static boolean findOnePossibleSumSubset(int index, int[] array, int n, int currentSum, int sum, List<Integer> list) {
        if (index == n) {
            //condition satisfied
            if (currentSum == sum) {
                System.out.println(list);
                return true;
            }
            //condition not satisfied
            else return false;
        }
        //pick
        list.add(array[index]);
        currentSum += array[index];
        if (findOnePossibleSumSubset(index + 1, array, n, currentSum, sum, list)) {
            return true;
        }

        //not pick
        Integer removed = list.remove(list.size() - 1);
        currentSum -= removed;
        if (findOnePossibleSumSubset(index + 1, array, n, currentSum, sum, list)) {
            return true;
        }

        return false;
    }

    private static int findTotalCountOfAllPossibleSubsequences(int index, int[] array, int n, int currentSum, int sum, List<Integer> list) {
        if (index == n) {
            if (currentSum == sum) {
                return 1;
            }
            else return 0;
        }
        //pick up
        list.add(array[index]);
        currentSum += array[index];
        int left = findTotalCountOfAllPossibleSubsequences(index+1, array, n, currentSum, sum, list);

        //not pick up
        Integer removed = list.remove(list.size() - 1);
        currentSum -= removed;
        int right = findTotalCountOfAllPossibleSubsequences(index+1, array, n, currentSum, sum, list);

        return left + right;
    }
}
