package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                    1        1
                    12      21
                    12     321
                    1234  4321
                    1234554321
 */
public class Pattern13 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 1; i <= n; i++) {
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }

            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
