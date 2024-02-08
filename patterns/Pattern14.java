package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                1
                2  3
                4  5  6
                7  8  9  10
                11  12  13  14  15
 */
public class Pattern14 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
