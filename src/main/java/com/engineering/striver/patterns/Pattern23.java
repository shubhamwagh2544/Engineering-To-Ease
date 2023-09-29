package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                ************
                *****  *****
                ****    ****
                ***      ***
                **        **
                *          *
                *          *
                **        **
                ***      ***
                ****    ****
                *****  *****
                ************
 */
public class Pattern23 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < (n-i); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < (n-i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

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
