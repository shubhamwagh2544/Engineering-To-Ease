package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
 */
public class Pattern9 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //combining 2 diff patterns
        //1: Pattern 7
        for (int i = 0; i < n; i++) {
            //spaces
            //for (int j = n-1; j >= i; j--) {
            for (int j = 0; j < (n-1-i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            //spaces
            //for (int j = n-1; j >= i; j--) {
            for (int j = 0; j < (n-1-i); j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        //2: Pattern 8
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < (2*(n-i-1)+1); k++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
