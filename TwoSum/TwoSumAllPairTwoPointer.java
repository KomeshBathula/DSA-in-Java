package TwoSum;
import java.util.*;
class TwoSumAllPairTwoPointer {
  public static void main(String[] args) {
    int arr[] = {6,1,3,5,4,7,2,8};
    List<List<Integer>> result = twoSumAllPairs(arr, 9);
    for (List<Integer> pair : result) {
      System.out.println(pair);
    }
  }
  static List<List<Integer>> twoSumAllPairs(int[] arr, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(arr);
    int i = 0, j = arr.length - 1;
    while (i < j) {
      int sum = arr[i] + arr[j];
      if(sum == target){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[i]);
        list.add(arr[j]);
        result.add(list);
        i++;
        j--;
      }
      else if(sum>target) j--;
      else i++;
    }
    return result;
  }
}
