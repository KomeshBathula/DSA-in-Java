public class SortArrayByParity{
  public static void main(String[] args) {
    int arr[] = {3,1,2,4};
    //int res[] = usingSegregationMethod(arr);
    int res[] = usingTwoPointerMethod(arr);
    for(int i = 0;i<res.length;i++) System.out.println(res[i]);
  }
  static int[] usingSegregationMethod(int arr[]){
    int res[] = new int[arr.length];
    int i = 0, j = arr.length - 1;
    for(int k = 0;k<arr.length;k++){
      if(arr[k] % 2 == 0){
        res[i] = arr[k];
        i++;
      }
      else{
        res[j] = arr[k];
        j--;
      }
    }
    return res;
  }
  //using two pointer method
  static int[] usingTwoPointerMethod(int arr[]){
    int i = 0, j = arr.length - 1;
    while(i<j){
      if(arr[i] %2 != 0 && arr[j] % 2 != 0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
      else if(arr[i] %2 == 0 && arr[j] % 2 != 0) j--;
      else i++;
    }
    return arr;
  }
}
