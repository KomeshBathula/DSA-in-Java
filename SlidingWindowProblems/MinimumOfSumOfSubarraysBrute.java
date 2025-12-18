package SlidingWindowProblems;

public class MinimumOfSumOfSubarraysBrute {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 3;
    System.out.println(maxOfSubarrays(arr, n, k));
  }
  private static int maxOfSubarrays(int arr[], int n, int k) {
    // int res[] = new int[n - k + 1];
    int min = Integer.MAX_VALUE;
    for (int i = 0; i <= n - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += arr[j];
      }
      min = Math.max(sum, min);
    }
    return min;
  }
}
