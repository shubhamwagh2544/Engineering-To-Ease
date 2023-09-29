package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                    *
                   **
                  ***
                 ****
                *****
                 ****
                  ***
                   **
                    *
 */
public class Pattern24 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        int space;
        int stars;
        for (int i = 1; i <= 2*n-1; i++) {
            //space
            if (i <= n) space = (n-i);
            else space = (i-n);

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //stars
            if (i <= n) stars = i;
            else stars = 2*n-i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
