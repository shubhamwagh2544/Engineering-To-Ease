package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
