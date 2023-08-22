package com.engineering.striver.recursion;

public class Recursion {
    public static void main(String[] args) {
        int count = 0;
        recursionCall(count);
    }

    private static void recursionCall(int count) {
        if (count == 5) {
            return;
        }
        System.out.println("count : " + count);
        count++;
        recursionCall(count);
    }
}
