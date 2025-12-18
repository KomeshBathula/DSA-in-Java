package SlidingWindowProblems;

public class AverageOfSubarraysBrute {
  public static void main(String[] args) {
    int n = 8;
    int arr[] = {1,2,3,4,5,6,7,8};
    int k = 3;
    int res[] = sumOfSubarrays(arr, n, k);
    for (int val : res) System.out.print(val + " ");
  }
  private static int[] sumOfSubarrays(int arr[], int n, int k) {
    int res[] = new int[n - k + 1];
    for (int i = 0; i <= n - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += arr[j];
      }
      res[i] = sum / k;
    }
    return res;
  }
}
