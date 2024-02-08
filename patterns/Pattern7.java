package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                     *
                   * * *
                 * * * * *
               * * * * * * *
             * * * * * * * * *
 */
public class Pattern7 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //3 parts
        //1 : 4 -> 0 spaces
        //2 : 1 -> 9 stars
        //3 : 4 -> 0 spaces

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
    }
}
