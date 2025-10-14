package Searching;

public class LinearSearchIndexRec {
  public static void main(String[] args) {
    int arr[] = {7, 6, 9, 2, 5, 1, 10};
    int target = 5;
    System.out.println(linearSearch(arr, 0, target));
  }
  static int linearSearch(int[] arr, int j, int target) {
    if(j == arr.length) return -1;
    else {
      if(arr[j] == target) {
        return j;
      }
      else return linearSearch(arr, j+1, target);
    }
  }
}

