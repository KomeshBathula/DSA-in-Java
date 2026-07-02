package Trie;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    private static String findLongestCommonPrefix(String[] arr) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int i = 0;
        while (s1.charAt(i) == s2.charAt(i)) {
            sb.append(s1.charAt(i));
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        // Using sorting 
        String ans = findLongestCommonPrefix(arr);
        System.out.println(ans);
        sc.close();
    }
}

// You are given array of strings and find longest common prefix among all the strings 
// present in the array. 
// Ex: n 
// arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"}
// O/p: gee