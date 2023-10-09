package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                 *        *
                 **      **
                 ***    ***
                 ****  ****
                 **********
 */
public class Pattern22 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
