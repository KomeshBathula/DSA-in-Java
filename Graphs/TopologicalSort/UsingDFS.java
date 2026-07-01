package Graphs.TopologicalSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class UsingDFS {
    private static void dfs(ArrayList<ArrayList<Integer>> adjList, int node, int[] visited, Stack<Integer> st) {
        
        for (int neighbor : adjList.get(node)) {
            if (visited[neighbor] == -1)
                dfs(adjList, neighbor, visited, st);
        }
        visited[node] = 1;
        st.push(node);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
        }
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) 
                dfs(adjList, i, visited, st);
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!st.isEmpty()) {
            res.add(st.pop());
        }

        for (int i : res) System.out.print(i + " ");
        sc.close();
    }
}
