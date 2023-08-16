package com.engineering.algoexpert.easy;

import java.util.*;

public class TournamentWinner {
    public static void main(String[] args) {
        /*
        String[][] competitions = {
                {"HTML", "C#"},
                {"C#", "Python"},
                {"Python", "HTML"}
        };
        int[] results = {0, 0, 1};

        whoIsTournamentWinner(competitions, results);
        */

        ArrayList<ArrayList<String>> competitions =
                new ArrayList<>(
                        Arrays.asList(
                                new ArrayList<>(Arrays.asList("HTML", "C#")),
                                new ArrayList<>(Arrays.asList("C#", "Python")),
                                new ArrayList<>(Arrays.asList("Python", "HTML"))
                        )
                );
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0 , 1));

        tournamentWinner(competitions, results);
    }

    public static void tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        //O(N)
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            if (results.get(i) == 0) {
                if (!map.containsKey(competitions.get(i).get(1))) {
                    map.put(competitions.get(i).get(1), 3);
                }
                else {
                    map.put(competitions.get(i).get(1), map.get(competitions.get(i).get(1))+3);
                }
            }
            else {
                if (!map.containsKey(competitions.get(i).get(0))) {
                    map.put(competitions.get(i).get(0), 3);
                }
                else {
                    map.put(competitions.get(i).get(0), map.get(competitions.get(i).get(0))+3);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result + " - " + max);
    }

    private static void whoIsTournamentWinner(String[][] competitions, int[] results) {
        //O(N)
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < competitions.length; i++) {
            if (results[i] == 0) {
                if (!map.containsKey(competitions[i][1])) {
                    map.put(competitions[i][1], 3);
                }
                else {
                    map.put(competitions[i][1], map.get(competitions[i][1])+3);
                }
            }
            else {
                if (!map.containsKey(competitions[i][0])) {
                    map.put(competitions[i][0], 3);
                }
                else {
                    map.put(competitions[i][0], map.get(competitions[i][0])+3);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result + " - " + max);
    }
}
