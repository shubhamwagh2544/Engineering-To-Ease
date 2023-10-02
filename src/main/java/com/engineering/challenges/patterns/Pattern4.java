package com.engineering.challenges.patterns;

import com.engineering.challenges.recursion.ScannerProvider;

/*
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
 */
public class Pattern4 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
