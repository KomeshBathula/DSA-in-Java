package SlidingWindowProblems;

import java.util.ArrayList;

public class SumOfSubarraysBruteArrayList {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 3;
    ArrayList<Integer> list = sumOfSubarrays(arr, n, k);
    for (int val : list) System.out.print(val + " ");
  }
  private static ArrayList<Integer> sumOfSubarrays(int arr[], int n, int k) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i <= n - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += arr[j];
      }
      result.add(sum);
    }
    return result;
  }
}
