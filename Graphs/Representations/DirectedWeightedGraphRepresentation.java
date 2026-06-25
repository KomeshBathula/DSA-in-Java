package Graphs.Representations;

class Graph {
    int n;
    int M[][];
    Graph(int n) {
        this.n = n;
        M = new int[n][n];
    }
    void addEdge(int u, int v, int weight) {
        M[u][v] = weight;
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

public class DirectedWeightedGraphRepresentation {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 10);
        g.addEdge(1, 2, 20);
        g.addEdge(2, 3, 30);
        g.addEdge(3, 4, 40);
        g.addEdge(0, 4, 50);
        g.addEdge(1, 3, 60);
        g.printMatrix();
    }
}
