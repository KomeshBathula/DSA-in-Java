//import java.util.*;
class TwoSumAllPairSortCount {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8};
    System.out.println(twoSumAllPairs(arr, 9));
  }
  static int twoSumAllPairs(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          count++;
        }
      }
    }
    return count;
  }
}
