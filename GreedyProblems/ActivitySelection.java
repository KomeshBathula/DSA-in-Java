package GreedyProblems;

import java.util.Scanner;

public class ActivitySelection {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] start = new int[n];
    int[] finish = new int[n];
    for (int i = 0; i < n; i++)
      start[i] = sc.nextInt();
    for (int i = 0; i < n; i++)
      finish[i] = sc.nextInt();
    System.out.println(maxActivities(start, finish, n));
  }
  public static int maxActivities(int[] start, int[] finish, int n) {
    int ans = 0;
    int[][] arr = new int[n][2];
    for(int i = 0; i < n; i++) {
      arr[i][0] = start[i];
      arr[i][1] = finish[i];
    }
    java.util.Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
    
    return ans;
  }
}
