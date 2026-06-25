package Graphs.DisconnectedGraphs.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GraphForMatrix {
    int[][] M;
    int n;
    GraphForMatrix(int _n) {
        n = _n;
        M = new int[n][n];
    }

    void addEdge(int u, int v) {
        M[u][v] = 1;
        M[v][u] = 1;
    }

    List<Integer> getDFS() {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
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
public class DFSMatrixRecursionWithoutStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        GraphForMatrix obj = new GraphForMatrix(n);
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }
        List<Integer> res = obj.getDFS();
        for (int i : res) 
            System.out.print(i+" ");
        sc.close();
    }
}
