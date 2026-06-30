package Graphs.DSUProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FriendshipRelations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DSU set = new DSU(n);

        while (true) {
            System.out.println("1. Add friend ship relation");
            System.out.println("2. Execute query whether friends or not");
            System.out.println("3. how many friend ship groups");
            System.out.println("4. persons in each friendship");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                set.union(u, v);
            }
            else if (choice == 2) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int uPar = set.find(u);
                int vPar = set.find(v);
                if (uPar != vPar) 
                    System.out.println("They are not friends");
                else
                    System.out.println("They are friends");
            }

            else if (choice == 3) {
                HashSet<Integer> unique = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    unique.add(set.find(i));
                }
                System.out.println(unique.size());
            }
            else if (choice == 4) {
                HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
                
                for (int i = 0; i < n; i++) {
                    int parent = set.find(i);

                    if (!map.containsKey(parent)) 
                        map.put(parent, new ArrayList<>());

                    map.get(parent).add(i);
                }

                int node = 0;
                for (ArrayList<Integer> mem : map.values()) {
                    System.out.println("Group "+node); 
                    for (int person : mem) 
                        System.out.print(person+" ");
                    System.out.println();
                    node++;
                }
            }
            else if (choice == 5) {
                sc.close();
                System.exit(0);
            }

            else 
                System.out.println("Invalid Choice");
        }
    }
}
