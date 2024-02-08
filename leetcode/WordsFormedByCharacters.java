package com.engineering.leetcode;

import java.util.Arrays;

public class WordsFormedByCharacters {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        canWordsBeFormedByCharacters(words, chars);
    }

    private static void canWordsBeFormedByCharacters(String[] words, String chars) {
        int[] cnt = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            cnt[chars.charAt(i)-'a']++;
        }

        int res = 0;
        for (String s : words) {
            if (canFormWord(s, cnt)) {
                res += s.length();
            }
        }

        System.out.println(res);
    }

    private static boolean canFormWord(String s, int[] cnt) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;

            if (count[s.charAt(i)-'a'] > cnt[s.charAt(i)-'a']) {
                return false;
            }
        }
        return true;
    }
}
