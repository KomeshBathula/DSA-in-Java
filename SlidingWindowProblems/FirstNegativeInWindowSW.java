package SlidingWindowProblems;

import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeInWindowSW {
  public static void main(String[] args) {
    int arr[] = {-4, 5, -5, -6, 5, 6, -1};
    int n = 7, k = 3;
    int res[] = firstNegative(arr, n, k);
    for (int val : res) System.out.print(val + " ");
  }
  private static int[] firstNegative(int arr[], int n, int k) {
    int res[] = new int[n - k + 1];
    Deque<Integer> dq = new LinkedList<>();
    for (int i = 0; i < k; i++){
      if(arr[i] < 0) dq.addLast(i);
    }
    res[0] = arr[dq.peekFirst()];
    for (int i = k; i < n ; i++) {
      if (!dq.isEmpty() && dq.peekFirst() < i + k - 1) 
        dq.pollFirst();
      if(arr[i] < 0) dq.addLast(i);
      res[i-k+1] = arr[dq.peekFirst()];
    }
    return res;
  }
}
