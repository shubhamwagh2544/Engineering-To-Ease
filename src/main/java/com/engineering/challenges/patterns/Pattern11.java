package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
            1
            0 1
            0 1 0
            1 0 1 0
            1 0 1 0 1
 */
public class Pattern11 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        int digit = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (digit == 1) {
                    System.out.print(digit+ " ");
                    digit = 0;
                }
                else {
                    System.out.print(digit+ " ");
                    digit = 1;
                }
            }
            System.out.println();
        }
    }
}
