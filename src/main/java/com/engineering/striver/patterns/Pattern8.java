package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
            * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *
 */
public class Pattern8 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //1 : space : 0 -> 4
        //2 : stars : 9 -> 1
        //3 : space : 0 -> 4

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
