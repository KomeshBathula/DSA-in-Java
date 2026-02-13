package SlidingWindowProblems;

public class FirstNegativeInWindowBrute {
  public static void main(String[] args) {
    int arr[] = {-4, 5, -4, -6, 5, 6, -1};
    int n = 7, k = 3;
    int res[] = firstNegative(arr, n, k);
    for (int val : res) System.out.print(val + " ");
  }
  private static int[] firstNegative(int arr[], int n, int k) {
    int res[] = new int[n - k + 1];
    for (int i = 0; i <= n - k; i++) 
      {
      //boolean found = false;
      for (int j = i; j < i + k; j++)
         {
        if(arr[j] < 0) {
          //found = true;
          res[i] = arr[j];
          break;
        }
      
      }
    }
    return res;
  }
}
