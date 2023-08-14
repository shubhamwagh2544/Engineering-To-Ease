package com.engineering.gfgcontest.contest115;

//Link : https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-115/problems

import java.util.Scanner;

public class CompleteTheStaircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        completeRows1(n);
        completeRows2(n);
    }

    private static void completeRows2(int n) {
        int count = 0;
         int base = 1;
         while (n >= base) {
             n = n - base;
             base++;
             count++;
         }
        System.out.println(count);
    }

    private static void completeRows1(int n) {
        int count = -1;
        int sum = 0;
        int add = 1;
        while (sum <= n) {
            sum = sum + add;
            add++;
            count++;
        }

        System.out.println(count);;
    }
}
