package Trie;

public class TrieImplementation {
    TrieNode root;

    TrieImplementation() {
        root = new TrieNode();
    }

    void insert(String s) {
        TrieNode curr = root;
        for (char ch : s.toCharArray()) {
            if (curr.child[ch - 'a'] == null) 
                curr.child[ch - 'a'] = new TrieNode();

            curr.child[ch - 'a'].count++;
            curr = curr.child[ch - 'a'];
        }
        curr.isLeaf = true;
        curr.count++;
    }

    boolean searchString(String s) {
        TrieNode curr = root;
        for (char ch : s.toCharArray()) {
            if (curr.child[ch - 'a'] == null)
                return false;

            curr = curr.child[ch - 'a'];
        }

        return curr.isLeaf;
    }

    boolean searchPrefix(String s) {
        TrieNode curr = root;
        for (char ch : s.toCharArray()) {
            if (curr.child[ch - 'a'] == null)
                return false;

            curr = curr.child[ch - 'a'];
        }

        return true;
    }

    int findCountOfPrefixStrings(String s) {
        TrieNode curr = root;
        for (char ch : s.toCharArray()) {
            if (curr.child[ch - 'a'] == null) 
                return 0;

            curr = curr.child[ch - 'a'];
        }

        return curr.count;
    }

    int findCountOfStrings(String s) {
        TrieNode curr = root;
        for (char ch : s.toCharArray()) {
            if (curr.child[ch - 'a'] == null) 
                return 0;

            curr = curr.child[ch - 'a'];
        }

        if (curr.isLeaf) 
            return curr.count;

        return 0;
    }
}
