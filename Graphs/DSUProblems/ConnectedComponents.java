package Graphs.DSUProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ConnectedComponents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DSU dsu = new DSU(n);
        int components = n;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        while (true) {
            System.out.println("1. Add edge");
            System.out.println("2. No. of components");
            System.out.println("3. All components");
            System.out.println("4. Specific component");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                if (dsu.find(u) != dsu.find(v))
                    components--;
                dsu.union(u, v);

                for (int i = 0; i < n; i++) {
                    int parent = dsu.find(i);

                    if (!map.containsKey(parent)) 
                        map.put(parent, new ArrayList<>());

                    map.get(parent).add(i);
                }
            }

            else if (choice == 2) {
                System.out.println(components);
            }

            else if (choice == 3) {
                int node = 0;
                for (ArrayList<Integer> mem : map.values()) {
                    System.out.println("Group "+node); 
                    for (int person : mem) 
                        System.out.print(person+" ");
                    System.out.println();
                    node++;
                }
            }

            else if (choice == 4) {
                System.out.println("Enter group: ");
                int node = sc.nextInt();
                for (int person : map.get(node)) {
                    System.out.print(person+" ");
                }
            }
            else if (choice == 5) 
                System.exit(0);
        }
    }
}
