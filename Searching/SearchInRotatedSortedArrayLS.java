package Searching;

public class SearchInRotatedSortedArrayLS {
  public static void main(String[] args) {
    int arr[] = {8,11,13,15,17,1,4,6};
    //System.out.println(11/2);
    System.out.println(searchInRotatedArray(arr, 4));
  }
  static int searchInRotatedArray(int arr[], int target){
    for(int i = 0;i<arr.length;i++){
      if(arr[i] == target) return i;
    }
    return -1;
  }
}
