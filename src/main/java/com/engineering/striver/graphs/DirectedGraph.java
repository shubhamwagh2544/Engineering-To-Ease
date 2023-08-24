package com.engineering.striver.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectedGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
                1 - 2
                1 - 3
                3 - 4
                2 - 4
                2 - 5
                4 - 5
         */
        int n = 5;
        int m = 6;
        //matrixStore(n , m, scanner);
        listStore(n, m, scanner);
    }

    private static void listStore(int n, int m, Scanner scanner) {
        //O(2M) => O(M)
        // 1 based indexing

        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            list.get(u).add(v);
        }

        for (List list1 : list) {
            System.out.println(list1);
        }
    }

    private static void matrixStore(int n, int m, Scanner scanner) {
        //O(n2)
        int[][] adjacentMatrix = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            // u ---> v
            adjacentMatrix[u][v] = 1;
        }
        /*
        for (int i = 0; i < adjacentMatrix.length; i++) {
            for (int j = 0; j < adjacentMatrix.length; j++) {
                System.out.print(adjacentMatrix[i][j] + " ");
            }
            System.out.println();
        }
         */
        for (int[] matrix : adjacentMatrix) {
            for (int j = 0; j < adjacentMatrix.length; j++) {
                System.out.print(matrix[j] + " ");
            }
            System.out.println();
        }
    }
}
