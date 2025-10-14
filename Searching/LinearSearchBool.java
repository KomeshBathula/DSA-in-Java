package Searching;

public class LinearSearchBool {
  public static void main(String[] args) {
    int arr[] = {7, 6, 9, 2, 5, 1, 10};
    int target = 5;
    System.out.println(linearSearch(arr, target));
  }
  static boolean linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return true;
      }
    }
    return false;
  }
}
