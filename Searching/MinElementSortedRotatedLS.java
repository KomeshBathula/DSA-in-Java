package Searching;

public class MinElementSortedRotatedLS {
  public static void main(String[] args) {
    int arr[] = {11,12,13,14,15,1,2};
    System.out.println(getMinElement(arr));
  }
  static int getMinElement(int arr[]) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
