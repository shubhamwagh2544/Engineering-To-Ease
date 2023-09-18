package com.engineering.striver.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindTwoDuplicates {
    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 2, 3, 1};            //range of 1 to N

        //TC : O(n * n)
        //SC : O(1)
        brute(array, array.length);

        better(array, array.length);
    }

    private static void better(int[] array, int length) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            }
            else {
                map.put(element, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void brute(int[] array, int length) {
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
