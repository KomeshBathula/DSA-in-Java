package SlidingWindowProblems;

import java.util.ArrayList;

public class SumOfSubarraysSW2ArrayList {
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
    for (int i = k; i < n; i++) {
      sum = sum + arr[i] - arr[i - k];
      result.add(sum);
    }
    return result;
  }
}
