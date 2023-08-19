package com.engineering.striver.graphs;

import java.util.Scanner;

public class Graphs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int m = 6;
        matrixStore(n , m, scanner);
    }

    private static void matrixStore(int n, int m, Scanner scanner) {
        int[][] adjacentMatrix = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adjacentMatrix[u][v] = 1;
            adjacentMatrix[v][u] = 1;
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
