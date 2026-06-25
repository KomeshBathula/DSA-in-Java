package Graphs.DisconnectedGraphs.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GraphForMatrix1 {
    int[][] M;
    int n;
    GraphForMatrix1(int _n) {
        n = _n;
        M = new int[n][n];
    }

    void addEdge(int u, int v) {
        M[u][v] = 1;
        M[v][u] = 1;
    }

    List<Integer> getDFS(int start) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        DFS(visited, start, res);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) 
                DFS(visited, i, res);
        }
        return res;
    }

    void DFS(boolean[] visited, int node, List<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int i = 0; i < n; i++) {
            if (M[node][i] == 1 && !visited[i]) 
                DFS(visited, i, res);
        }
    }

}

public class DFSMatrixRecursionWithStart {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphForMatrix1 obj = new GraphForMatrix1(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }
        System.out.println("Enter start");
        int start = sc.nextInt();
        List<Integer> res = obj.getDFS(start);
        for (int i : res) 
            System.out.print(i+" ");
        sc.close();
    }    
}
