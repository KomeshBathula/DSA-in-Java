package SlidingWindowProblems;

public class MinimumOfSumOfSubarraysSW1 {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 3;
    System.out.println(sumOfSubarrays(arr, n, k));
  }
  private static int sumOfSubarrays(int arr[], int n, int k) {
    // int res[] = new int[n - k + 1];
    int min = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += arr[i];
    min = Math.max(sum, min);
    for (int i = 1; i <= n - k; i++) {
      sum = sum + arr[i + k - 1] - arr[i - 1];
      min = Math.max(min, sum);
    }
    return min;
  }
}
