package SlidingWindowProblems;

import java.util.*;

public class SumOfSubarraysSW1ArrayList {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 3;
    ArrayList<Integer> list = sumOfSubarrays(arr, n, k);
    for (int val : list) System.out.print(val + " ");
  }
  private static ArrayList<Integer> sumOfSubarrays(int arr[], int n, int k) {
    ArrayList<Integer> result = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += arr[i];
    result.add(sum);
    for (int i = 1; i <= n - k; i++) {
      sum = sum + arr[i + k - 1] - arr[i - 1];
      result.add(sum);
    }
    return result;
  }
}
