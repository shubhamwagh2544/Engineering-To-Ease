package com.engineering.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;


public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = {3, 5, -1, 8, 11, 1, -1, 6};
        int n = array.length;
        int targetSum = 10;

        approach1(array, n, targetSum);
        approach2(array, n, targetSum);
        approach3(array, n, targetSum);
    }

    private static void approach3(int[] array, int n, int targetSum) {
        //one loop : [ X+Y = targetSum ]
        int start = 0;
        int end = n-1;

        int[] ans = new int[2];
        while (start <= end) {
            if (array[start] + array[end] == targetSum) {
                ans[0] = array[start];
                ans[1] = array[end];
                break;
            }
            else if (array[start] + array[end] > targetSum) {
                end--;
            }
            else {
                start++;
            }
        }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    private static void approach2(int[] array, int n, int targetSum) {
        //one loop : [ X+Y = targetSum ]
        int first = -1;
        int two = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            two = targetSum - array[i];
            first = array[i];
            if (list.contains(two)) {
                break;
            }
            else {
                list.add(array[i]);
            }
        }
        System.out.println(first);
        System.out.println(two);
    }

    private static void approach1(int[] array, int n, int targetSum) {
        //two loops approach
        // TC : O(N2)
        // SC : O(1)
        int[] ans = new int[2];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] + array[j] == targetSum) {
                    ans[0] = array[i];
                    ans[1] = array[j];
                    break;
                }
            }
        }

        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
