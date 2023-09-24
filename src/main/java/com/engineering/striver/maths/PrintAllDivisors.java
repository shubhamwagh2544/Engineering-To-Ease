package com.engineering.striver.maths;

import com.engineering.striver.recursion.ScannerProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        brute(n);

        better(n);
    }

    private static void better(int n) {
        //if needed in sorted order :> use list
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (n/i != i) {
                    System.out.print(i + " " + n/i + " ");
                    list.add(i);
                    list.add(n/i);
                }
                else {
                    System.out.println(i);
                    list.add(i);
                }
            }
        }
        //square root
        //System.out.println((int)Math.sqrt(n));

        Collections.sort(list);
        System.out.println(list);
    }

    private static void brute(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
