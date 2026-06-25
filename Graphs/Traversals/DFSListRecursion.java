package Graphs.Traversals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Graph2 {

    void traversal(int n, int[] visited, List<List<Integer>> adjacencyList) {
        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) {
                DFSTraversal(i, visited, adjacencyList);
            }
        }
    }

    void DFSTraversal(int start, int[] visited, List<List<Integer>> adjacencyList) {
        System.out.print(start + " ");
        visited[start] = 1;

        for (int i : adjacencyList.get(start)) {
            if (visited[i] == -1) {
                DFSTraversal(i, visited, adjacencyList);
            }
        }
    }
}

public class DFSListRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        int[] visited = new int[n];
        Arrays.fill(visited, -1);

        Graph2 g = new Graph2();

        System.out.print("DFS Traversal: ");
        g.traversal(n, visited, adjacencyList);

        sc.close();
    }
}