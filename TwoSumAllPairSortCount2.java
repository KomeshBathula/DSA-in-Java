
class TwoSumAllPairTwoSortCount2 {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8};
    System.out.println(twoSumAllPairs(arr, 9));
  }
  static int twoSumAllPairs(int[] arr, int target) {
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
