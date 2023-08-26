package com.engineering.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int[] array = {3, 1, 2};

        int index = 0;
        List<Integer> list = new ArrayList<>();
        printAllSubsequencesUsingRecursion(index, array.length, array, list);
    }

    private static void printAllSubsequencesUsingRecursion(int index, int n, int[] array, List<Integer> list) {
        //analogy if picking or not picking number at same time => 2 possible outcomes
        //TC: O(2^n)
        if (index == n) {
            System.out.println(list);
            return;
        }
        //what if picked up
        list.add(array[index]);
        printAllSubsequencesUsingRecursion(index+1, n, array, list);

        //what if not picked up
        list.remove(list.size()-1);
        printAllSubsequencesUsingRecursion(index+1, n, array, list);
    }
}
