public class SortArraysOf012 {
  public static void main(String[] args) {
    int arr[] = {0, 1, 2, 0, 1, 2, 0, 1, 2};
    int res[] = sortArray(arr);
    for (int num : res) {
      System.out.print(num + " ");
    }
  }

  static int[] sortArray(int arr[]){
    int res[] = new int[arr.length];
    int count0 = 0, count1 = 0, count2 = 0;
    for (int num : arr) {
      if (num == 0) count0++;
      else if (num == 1) count1++;
      else if (num == 2) count2++;
    }
    for (int i = 0; i < count0; i++) {
      res[i] = 0;
    }
    for (int i = count0; i < count0 + count1; i++){
      res[i] = 1;
    }
    for (int i = count0 + count1; i < arr.length; i++) {
      res[i] = 2;
    }
    return res;

}
}