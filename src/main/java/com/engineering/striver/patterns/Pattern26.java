package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                 * * * *
                 *     *
                 *     *
                 * * * *
 */
public class Pattern26 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //trick : print n*n matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        //note: we only have to skip middle elements from printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
