package com.engineering.striver.recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();
        printNameNTimes(n);
        printNameNTimesAnother(1, n);
    }

    private static void printNameNTimesAnother(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Shubham Wagh");
        printNameNTimesAnother(i+1, n);
    }

    private static void printNameNTimes(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Shubham Wagh");
        //n = n-1;
        printNameNTimes(n-1);
    }
}
