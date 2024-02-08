package com.engineering.challenges.arrays;

import java.util.Arrays;

public class RotateMatrixBy90Clockwise {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        /*
                    1 2 3        7 4 1
                    4 5 6   =>   8 5 2
                    7 8 9        9 6 3
         */

        //TC : O(row * col)
        //SC : O(row * col)
        brute(matrix, row, col);

        //TC : O(row * col) + O(row * col)
        //SC : O(1)
        better(matrix, row, col);
    }

    private static void better(int[][] matrix, int row, int col) {
        //transpose is where A(ij) becomes A(ji)
        //no need to travel full : travel only half part since diagonal elements remain same

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j);
            }
        }

        //reversing
        for (int i = 0; i <= row; i++) {
            reverseMatrix(matrix, 0, matrix[i].length-1, i);
        }

        Arrays.stream(matrix).forEach(array -> System.out.println(Arrays.toString(array)));
    }

    private static void reverseMatrix(int[][] matrix, int low, int high, int row) {
        while (low < high) {
            int temp = matrix[row][low];
            matrix[row][low] = matrix[row][high];
            matrix[row][high] = temp;
            low++;
            high--;
        }
    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private static void brute(int[][] matrix, int row, int col) {
        //simple traversing and storing
        int[][] ans = new int[row+1][col+1];

        for (int i = 0; i <= col; i++) {
            int k = 0;
            for (int j = row; j >= 0; j--) {
                //print
                System.out.print(matrix[j][i] + " ");
                //store
                ans[i][k++] = matrix[j][i];
            }
            System.out.println();
        }

        Arrays.stream(ans).forEach(array -> System.out.println(Arrays.toString(array)));
    }
}
