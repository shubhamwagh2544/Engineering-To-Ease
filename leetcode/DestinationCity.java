package com.engineering.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < paths.size(); i++) {
            List<String> path = paths.get(i);
            for (String s : path) {
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }

        // map with destination and source
        String dest = "";
        String src = "";

        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                if (count == 0) {
                    dest = entry.getKey();
                    count++;
                }
                else {
                    src = entry.getKey();
                    break;
                }
            }
        }

        for (int i = 0; i < paths.size(); i++) {
            if (paths.get(i).get(0).equals(dest)) return src;
            if (paths.get(i).get(0).equals(src)) return dest;
        }
        return "";
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> paths = List.of(
                List.of("London","New York"),
                List.of("New York","Lima"),
                List.of("Lima","Sao Paulo")
        );

        System.out.println(destCity(paths));
    }
}
