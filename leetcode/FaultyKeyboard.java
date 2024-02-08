package com.engineering.leetcode;

public class FaultyKeyboard {
    public static void main(String[] args) {
        //String s = "string";
        String s = "poiinter";

        faultyKeyboard(s);
    }

    private static void faultyKeyboard(String s) {
        StringBuilder res = new StringBuilder();

        for (var ch : s.toCharArray()) {
            if (ch == 'i') res.reverse();
            else res.append(ch);
        }

        System.out.println(new String(res));
    }
}
