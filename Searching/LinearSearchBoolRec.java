package Searching;

public class LinearSearchBoolRec {
  public static void main(String[] args) {
    int arr[] = {7, 6, 9, 2, 5, 1, 10};
    int target = 5;
    System.out.println(linearSearch(arr, 0, target));
  }
  static boolean linearSearch(int[] arr, int j, int target) {
    if(j == arr.length) return false;
    else {
      if(arr[j] == target) {
        return true;
      }
      else return linearSearch(arr, j+1, target);
    }
  }
}

