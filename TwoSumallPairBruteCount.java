//import java.util.*;
class TwoSumAllPairBrute {
  public static void main(String[] args) {
    int arr[] = {6,1,3,5,4,7,2,8};
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
