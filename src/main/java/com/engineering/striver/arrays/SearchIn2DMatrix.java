package com.engineering.striver.arrays;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] array = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 16;

        //TC : O(n * m) where n is rows, m is columns
        //SC : O(1)
        brute(array, target);

        //TC : O(logN + logM)
        //SC : O(1)
        better(array, target);

        //TC : O(log(m*n))
        //SC : O(1)
        optimal(array, target);
    }

    private static void optimal(int[][] array, int target) {
        //flattening 2D array to 1D array
        /*
           2D   0    1   2   3

           0    1    3   5   7

           1    10  11  16  20

           2    23  30  34  60

           1D   1    3   5   7  10  11  16  20  23  30  34  60
                0    1   2   3   4   5   6   7   8   9  10  11

               row = index / col
               col = index % col
         */
        int row = 3;          //row
        int col = 4;          //column

        int start = 0;
        int end = (row * col) -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == array[mid/col][mid%col]) {
                System.out.println("Found at : [" + mid/col + "] [" + mid%col+ "]");
                return;
            }
            else if (target < array[mid/col][mid%col]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        System.out.println("Not Found: [-1] [-1]");
    }

    private static void better(int[][] array, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);

        int start = 0;
        int end = array.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target <= array[mid][0]) {
                if (array[mid][0] == target) {
                    ans[0] = mid;
                    ans[1] = 0;
                    return;
                }
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        if (end < 0) end = 0;
        binarySearchOn2DMatrix(array, end, target, ans);

        System.out.println("Found at : [" + ans[0] + "] [" + ans[1]+ "]");
    }

    private static void binarySearchOn2DMatrix(int[][] array, int row, int target, int[] ans) {
        int start = 0;
        int end = array[0].length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == array[row][mid]) {
                ans[0] = row;
                ans[1] = mid;
                return;
            }
            else if (target < array[row][mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
    }

    private static void brute(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Found at : [" + i +"] [" + j + "]");
                    return;
                }
            }
        }

        System.out.println("Not Found: [-1] [-1]");
    }
}