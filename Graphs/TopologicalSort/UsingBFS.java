package Graphs.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class UsingBFS {
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

        int[] ind = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int x : adjList.get(i)) 
                ind[x]++;
        }
        for (int i = 0; i < n; i++) {
            if (ind[i] == 0) 
                q.add(i);
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);

            for (int neighbor : adjList.get(curr)) {
                ind[neighbor]--;
                if (ind[neighbor] == 0) 
                    q.add(neighbor);
            }
        }

        for (int i : res) System.out.print(i+" ");
        sc.close();
    }
}
