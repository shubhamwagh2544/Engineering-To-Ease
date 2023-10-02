package com.engineering.challenges.patterns;

import com.engineering.challenges.recursion.ScannerProvider;

/*
             **********
             ****  ****
             ***    ***
             **      **
             *        *
 */
public class Pattern21 {
    public static void main(String[] args) {
        //1 : stars
        //2 : spaces
        //3 : stars

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
    }
}
