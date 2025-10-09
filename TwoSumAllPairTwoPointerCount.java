import java.util.Arrays;
class TwoSumAllPairTwoPointerCount {
  public static void main(String[] args) {
    int arr[] = {6,1,3,5,4,7,2,8};
    System.out.println(twoSumAllPairs(arr, 9));
  }
  static int twoSumAllPairs(int[] arr, int target) {
    Arrays.sort(arr);
    int i = 0, j = arr.length - 1;
    int count = 0;
    while (i < j) {
      int sum = arr[i] + arr[j];
      if(sum == target){
        count++;
        i++;
        j--;
      }
      else if(sum>target) j--;
      else i++;
    }
    return count;
  }
}
