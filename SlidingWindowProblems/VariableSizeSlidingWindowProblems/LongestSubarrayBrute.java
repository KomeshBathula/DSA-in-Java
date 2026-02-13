package SlidingWindowProblems.VariableSizeSlidingWindowProblems;

import java.util.ArrayList;

public class LongestSubarrayBrute {
  public static void main(String[] args) {
    int arr[] = {10, 5, 2, 7, 1, -10, 7, 6, 4, 2};
    int n = 10, target = 15;
    getLongestSubarray(arr, n, target);
  }
  static void getLongestSubarray(int arr[], int n, int target) {
    int maxLen = 0;
    int start = -1, end = -1;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == target) {
          if (j - i + 1 > maxLen) {
            start = i;
            end = j;
            maxLen = j - i + 1;
          }
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
