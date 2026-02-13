package Searching;

public class HowManyRotationsUsingBS {
  public static void main(String[] args) {
    int arr[] = {11,12,13,14,15,1,2};
    System.out.println(getHowManyRotations(arr));
  }
  static int getHowManyRotations(int arr[]){
    int left = 0, right = arr.length - 1;
    while(left<=right){ 
      int mid = (left+right)/2;
      if(arr[mid]<arr[right]) right = mid;
      else left = mid+1;
    }
    return left-1;
  }
}
