package ThreeSum;

public class ThreeSumExistsBrute {
  public static void main(String[] args) {
    int arr[]  = {2,6,3,9,12,5,15};
    System.out.println(threeSumExistsOrNot(arr, 18));
  }
  static boolean threeSumExistsOrNot(int arr[], int target){
    for(int i = 0;i<arr.length;i++){
      for(int j = i + 1;j<arr.length;j++){
        for(int k = j + 1;k<arr.length;k++){
          if(arr[i] + arr[j] + arr[k] == target) return true;
        }
      }
    }
    return false;
  }
}
