package Searching;

public class HowManyRotationsUsingLS {
  public static void main(String[] args) {
    int arr[] = {11,12,13,14,15,1,2};
    System.out.println(getHowManyRotations(arr));
  }
  static int getHowManyRotations(int arr[]){
    for(int i = 0; i<arr.length; i++){
      if(arr[i] > arr[i+1]) return i+1;
    }
    return 0; 
  }
}
