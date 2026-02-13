import java.util.*;
class TwoSumAllPairBrute {
  public static void main(String[] args) {
    int arr[] = {6,1,3,5,4,7,2,8};
    List<List<Integer>> result = twoSumAllPairs(arr, 9);
    for (List<Integer> pair : result) {
      System.out.println(pair);
    }
  }
  static List<List<Integer>> twoSumAllPairs(int[] arr, int target) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          ArrayList<Integer> pair = new ArrayList<>();
          pair.add(arr[i]);
          pair.add(arr[j]);
          result.add(pair);
        }
      }
    }
    return result;
  }
}
