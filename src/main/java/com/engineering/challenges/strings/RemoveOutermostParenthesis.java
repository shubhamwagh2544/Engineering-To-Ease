package com.engineering.challenges.strings;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";

        removeOutermostParenthesis_1(s, s.length());
        removeOutermostParenthesis_2(s, s.length());

        //fast : StringBuilder
        removeOutermostParenthesis_3(s, s.length());

        //faster
        removeOutermostParenthesis_4(s, s.length());
    }

    private static void removeOutermostParenthesis_4(String s, int length) {
        StringBuilder str = new StringBuilder();
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (cnt != 0) {
                    str.append(c);
                }
                cnt++;
            }
            else {
                if (cnt != 1) {
                    str.append(c);
                }
                cnt--;
            }
        }

        System.out.println(str.toString());         //convert to string
    }

    private static void removeOutermostParenthesis_3(String s, int length) {
        StringBuilder str = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                if (cnt != 0) {
                    str.append(s.charAt(i));
                }
                cnt++;
            }
            else {
                if (cnt != 1) {
                    str.append(s.charAt(i));
                }
                cnt--;
            }
        }

        System.out.println(str.toString());
    }

    private static void removeOutermostParenthesis_2(String s, int length) {
        String res = "";
        int cnt = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(' && cnt == 0) {
                cnt++;
            }
            else if (s.charAt(i) == '(' && cnt >= 1) {
                res += s.charAt(i);
                cnt++;
            }
            else if (s.charAt(i) == ')' && cnt > 1) {
                res += s.charAt(i);
                cnt--;
            }
            else if (s.charAt(i) == ')' && cnt == 1) {
                cnt--;
            }
        }

        System.out.println(res);
    }

    private static void removeOutermostParenthesis_1(String s, int length) {
        String res = "";
        int ind = 0;

        for (char c : s.toCharArray()) {
            if (c  == '(' && ind++ > 0) res += c;
            if (c == ')' && ind-- > 1) res += c;
        }

        System.out.println(res);
    }
}
