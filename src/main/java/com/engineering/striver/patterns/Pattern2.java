package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
         *
         * *
         * * *
         * * * *
         * * * * *
 */
public class Pattern2 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
