package SlidingWindowProblems;

import java.util.Scanner;

public class SumOfSubarraysBrute {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    int k = sc.nextInt();
    int res[] = sumOfSubarrays(arr, n, k);
    for (int val : res) System.out.print(val + " ");
    sc.close();
  }
  private static int[] sumOfSubarrays(int arr[], int n, int k) {
    int res[] = new int[n - k + 1];
    for (int i = 0; i <= n - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += arr[j];
      }
      res[i] = sum;
    }
    return res;
  }
}
