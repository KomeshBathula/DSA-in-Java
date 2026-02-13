package SlidingWindowProblems;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumValueInEachSubArraySW {
  public static void main(String[] args) {
    int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
    int n = 8, k = 3;
    maxValueInEachSubArray(arr, n, k);
  }
  private static void maxValueInEachSubArray(int arr[], int n, int k) {
    int res[] = new int[n - k + 1];
    Deque<Integer> dq = new LinkedList<>();
    for (int i = 0; i < k; i++) {
      while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) 
          dq.removeLast();
      dq.addLast(i);
    }
    res[0] = arr[dq.peekFirst()];
    for (int i = k; i < n; i++) {
      while (!dq.isEmpty() && dq.peekFirst() <= i - k) 
        dq.removeFirst();
      while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
        dq.removeLast();
      dq.addLast(i);
      res[i-k+1] = arr[dq.peekFirst()];
    }
    System.out.println(Arrays.toString(res));
  }
}
