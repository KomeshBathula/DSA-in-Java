package SlidingWindowProblems.VariableSizeSlidingWindowProblems;

public class CountOfSubarraysWithSumTargetBrute {
  public static void main(String[] args) {
    int arr[] = {10, 5, 2, 7, 1, -10, 5, 6, 4, 9, 8, 7};
    int n = 12, target = 15;
    getCountOfSubarrays(arr, n, target);
  }
  static int getCountOfSubarrays(int arr[], int n, int target) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == target) {
          count ++;
          for (int start = i; start <= j; start ++) 
            System.out.print(arr[start]+" ");
          System.out.println();
        }
        // System.out.println();
      }
    }
    System.out.println(count);
    return 0;
  }
}
