package Trie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrieImplementation t = new TrieImplementation();

        while (true) {
            System.out.println("1. Insert\n2. Search\n3. Prefix Search\n4. PrefixSearch\n5. CountPrefixString\n6. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                String s = sc.next();
                t.insert(s);
            }
            else if (choice == 2) {
                
            }
            if (choice == 6)
                System.exit(0);
        }

    }
}
