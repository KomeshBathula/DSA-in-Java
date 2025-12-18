package SlidingWindowProblems;

public class SumOfSubarraysSW2 {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,22,3,4,5,6,7,8};
    int k = 3;
    int res[] = sumOfSubarrays(arr, n, k);
    for (int val : res) System.out.print(val + " ");
  }
  private static int[] sumOfSubarrays(int arr[], int n, int k) {
    int res[] = new int[n - k + 1];
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += arr[i];
    res[0] = sum;
    for (int i = k; i < n; i++) {
      sum = sum + arr[i] - arr[i - k];
      res[i - k + 1] = sum;
    }
    return res;
  }
}
