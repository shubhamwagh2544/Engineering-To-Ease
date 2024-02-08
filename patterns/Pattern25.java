package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                 *        *
                 **      **
                 ***    ***
                 ****  ****
                 **********
                 ****  ****
                 ***    ***
                 **      **
                 *        *
 */
public class Pattern25 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        int stars;
        int space = 2*n-2;
        for (int i = 1; i <= 2*n-1; i++) {
            //stars
            if (i <= n) stars = i;
            else stars = 2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            if (i < n) space-=2;
            else space+=2;

            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
