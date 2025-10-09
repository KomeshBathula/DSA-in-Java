import java.util.*;
class TwoSumAllPairSortCount3 {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8};
    System.out.println(twoSumAllPairs(arr, 9));
  }
  static int twoSumAllPairs(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for(int i = 0;i<arr.length;i++){
      map.put(target-arr[i], map.getOrDefault(target-arr[i], 0) + 1);
      if(map.containsKey(arr[i])){
        count++;
      }
    }
    return count;
  }
}
