package SlidingWindowProblems;

import java.util.*;

public class MaximumSumOfAllDistinctSubarrays {
  public static void main(String[] args) {
    int arr[] = {1, 5, 4, 2, 9, 9, 9};
    int n = 7, k = 3;
    maximumSumOfDistinctSubarray(arr, n, k);
  }
  private static void maximumSumOfDistinctSubarray(int arr[], int n, int k) {
    int max = 0;
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < k; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      sum += arr[i];
    }
    // Set<Integer> s1 = map.keySet();
    // for (Integer x : s1) System.out.print(x + " " +map.get(x));
    // System.out.println();
    if(map.size() == k)
      max = Math.max(sum, max);
    for (int i = 1; i <= n - k; i++) {
      map.put(arr[i+k-1], map.getOrDefault(arr[i+k-1], 0) + 1);
      map.put(arr[i-1], map.get(arr[i-1]) - 1);
      if(map.get(arr[i-1]) == 0) map.remove(arr[i-1]);
      sum = sum + arr[i+k-1] - arr[i - 1];
      if (map.size() == k) max = Math.max(max, sum);
      // for (Integer x : s1) System.out.print(x + " " +map.get(x));
      // System.out.println();
    }
    System.out.println(max);
  }
}
