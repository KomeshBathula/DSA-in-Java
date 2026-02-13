package SlidingWindowProblems.VariableSizeSlidingWindowProblems;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubarraySW1 {
  public static void main(String[] args) {
    int arr[] = {10, 5, 2, 7, 1, -10, 7, 6, 4, 2};
    int n = 10, target = 15;
    getLongestSubarray(arr, n, target);
  }
  static void getLongestSubarray(int arr[], int n, int target) {
    int maxLen = 0;
    int start = -1, end = -1;
    HashMap<Integer, Integer> map = new HashMap<>();
    int prefixSum = 0;
    for (int i = 0; i < n; i++) {
      prefixSum += arr[i];
      if (prefixSum == target) {
        start = 0; end = i;
      }
      int rem = prefixSum - target;
      if (map.containsKey(rem)) {
        int len = i - map.get(rem);
        if (len > maxLen) {
          start = map.get(rem);
          end = len;
        }
      }
    }
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = start; i <= end; i++) {
      list.add(arr[i]);
    }
    for (int val : list) System.out.print(val + " ");
  }
}
