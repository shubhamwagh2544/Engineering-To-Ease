package com.engineering.striver.graphs;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        //graph input
        List<ArrayList<Integer>> list = takeGraphInput();
        //output
        printGraphOutput(list);
        //bfs traversal
        bfsTraversal(list);
        /*
                N - number of nodes or vertex
                E - number of edges

                TC: => O(N) + O(2E) => O(N+E)
                - while loop runs N times => O(N)
                - markVisited will visit all neighbouring nodes of each node => Total Degree of Graph => 2 * Edges

                SC : O(N)
                - queue stores N nodes
         */
    }

    private static List<ArrayList<Integer>> takeGraphInput() {
        /*
                7 Nodes
                7 Edges
                starting point = 1 (1 based indexing)
                1 - 2
                1 - 5
                2 - 3
                2 - 4
                5 - 6
                4 - 6
                5 - 7
         */
        Scanner scanner = new Scanner(System.in);
        int n = 7;
        int m = 7;
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            list.get(u).add(v);
            list.get(v).add(u);
        }
        return list;
    }

    private static void printGraphOutput(List<ArrayList<Integer>> list) {
        for (List<Integer> list1 : list) {
            System.out.println(list1);
        }
    }

    private static void bfsTraversal(List<ArrayList<Integer>> list) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[list.size()+1]; // N+1 Size of Array
        queue.add(1);   // starting point
        visited[1] = true;  // mark visited
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            System.out.print(poll + " ");
            ArrayList<Integer> currentList = list.get(poll);
            markVisited(queue, visited, currentList);
        }
    }

    private static void markVisited(Queue<Integer> queue, boolean[] visited, ArrayList<Integer> currentList) {
        for (int i = 0; i < currentList.size(); i++) {
            Integer i1 = currentList.get(i);
            if (visited[i1]) {
                continue;
            }
            queue.add(i1);
            visited[i1] = true;
        }
    }
}
