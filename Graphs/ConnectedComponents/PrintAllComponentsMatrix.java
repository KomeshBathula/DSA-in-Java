package Graphs.ConnectedComponents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GraphMatrix {
    int[][] M;
    int n;
    GraphMatrix(int _n) {
        n = _n;
        M = new int[n][n];
    }

    void addEdge(int u, int v) {
        M[u][v] = 1;
        M[v][u] = 1;
    }


    void DFS(boolean[] visited, int node, List<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int i = 0; i < n; i++) {
            if (M[node][i] == 1 && !visited[i]) {
                DFS(visited, i, res);
            }
        }
    }

}

public class PrintAllComponentsMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphMatrix g = new GraphMatrix(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }
        List<List<Integer>> components = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                g.DFS(visited, i, component);
                components.add(component);
            }
        }
        for (List<Integer> component : components) {
            for (int node : component) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
