package Searching;

public class CountOfOccurencesUsingLS {
  public static void main(String[] args) {
    int arr[] = {2,6,9,9,9,9,9, 15,15,15,24,24};
    int target = 9;
    System.out.println(usingLinearSearch(arr, target));
  }
  static int usingLinearSearch(int arr[], int target){
    int count = 0;
    for(int i = 0;i<arr.length;i++){
      if(arr[i] == target) count++;
    }
    return count;
  }
}
