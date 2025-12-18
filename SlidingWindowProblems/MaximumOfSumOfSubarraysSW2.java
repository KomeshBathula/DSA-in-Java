package SlidingWindowProblems;

public class MaximumOfSumOfSubarraysSW2 {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,22,3,4,5,6,7,8};
    int k = 3;
    System.out.println(sumOfSubarrays(arr, n, k));
  }
  private static int sumOfSubarrays(int arr[], int n, int k) {
    // int res[] = new int[n - k + 1];
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += arr[i];
    max = Math.max(max, sum);
    for (int i = k; i < n; i++) {
      sum = sum + arr[i] - arr[i - k];
      max = Math.max(max, sum);
    }
    return max;
  }
}
