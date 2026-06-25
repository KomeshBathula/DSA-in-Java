package Graphs.Representations;

class Graph {
    int n;
    int M[][];
    Graph(int n) {
        this.n = n;
        M = new int[n][n];
    }
    void addEdge(int u, int v) {
        M[u][v] = 1;
        M[v][u] = 1;
    }
    void printMatrix() {
        for (int i = 0; i < n; i++) 
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < n; i++) 
            System.out.print("-"+" ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class UndirectedGraphRepresentation {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.printMatrix();
    }
}
