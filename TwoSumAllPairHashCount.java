import java.util.*;
class TwoSumAllHashMapCount {
  public static void main(String[] args) {
    int arr[] = {6,1,3,5,4,7,2,8};
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
