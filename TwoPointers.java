//26 programs wrote in the same functions

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoPointers {
  public static void main(String[] args) {
    //palindromeOrNot("madam");
    //System.out.println(reverseString("komesh"));
    int arr[] = {10, 9, -3, 8, 6, 7};
    //System.out.println(twoSumOrNot(arr, 5));
    System.out.println(Arrays.toString(twoSumOrNotIndices(arr, 5)));
  }
  //palindrome or not using two pointers
  static void palindromeOrNot(String s){
    int left = 0, right = s.length()-1;
    while(left<right){
      if(s.charAt(left) != s.charAt(right)) System.out.println("No");
      left++;
      right--;
    }
    System.out.println("Yes");
  }
  //reverse the string using two pointers
  static String reverseString(String s){
    char arr[] = s.toCharArray();
    int left = 0, right = arr.length-1;
    while(left<right){
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return String.valueOf(arr);
  }
  //unsorted array true or false
  static boolean twoSumOrNot(int [] arr, int target){
      //brute force O(n*n)
    /*
    for(int i = 0;i<arr.length-1;i++){
      for(int j = i+1;j<arr.length;j++){
        if(arr[i] + arr[j] == target) return true;
      }
    }
    return false;
    */
      //using sorting and two pointer
    /*
    Arrays.sort(arr);
    int left = 0, right = arr.length-1;
    while(left<right){
      int sum = arr[left] + arr[right];
      if(sum == target) return true;
      else if(sum<target) left++;
      else right--;
    }
    return false;
    */
      //using sorting and binary search
    /*
    Arrays.sort(arr);
    for(int i = 0;i<arr.length;i++){
      if(binarySearch(arr, target - arr[i], i)) return true;
    }
    return false;
    */
      //using hashset
    /*
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0;i<arr.length;i++){
      if(!set.contains(target - arr[i])) set.add(arr[i]);
      else return true;
    }
    return false;
    */

  }
  static boolean binarySearch(int arr[], int x, int i){
    int left = 0, right = arr.length - 1;
    while(left<right){
      int m = (left+right)/2;
      if(arr[m] == x && i != m) return true;
      else if(x>arr[m]) left = m+1;
      else right = m - 1;
    }
    return false;
  }
  


  static int[] twoSumOrNotIndices(int arr[], int target){
      //brute force O(n*n)
    /*
    for(int i = 0;i<arr.length-1;i++){
      for(int j = i+1;j<arr.length;j++){
        if(arr[i] + arr[j] == target) return new int[]{i, j};
      }
    }
    return new int[]{-1, -1};
    */
      //using sorting and two pointer
    /*
    Arrays.sort(arr);
    int left = 0, right = arr.length-1;
    while(left<right){
      int sum = arr[left] + arr[right];
      if(sum == target) return new int[]{left, right};
      else if(sum<target) left++;
      else right--;
    }
    return new int[]{-1, -1};
    */

          //using sorting and binary search
    /*
    Arrays.sort(arr);
    for(int i = 0;i<arr.length;i++){
      if(binarySearch(arr, target - arr[i], i)) return new int[]{};
    }
    return false;
    */
        //using hashmap
    /*    
    HashMap<Integer, Integer> set = new HashMap<>();
    for(int i = 0;i<arr.length;i++){
      if(set.containsKey(target - arr[i])) return new int[] {set.get(target-arr[i]), i};
      else set.put(arr[i], i);
    }
    return new int[]{-1, -1};
    */

    
    
  }

  static int twoSumOrNotElements(int arr[], int target){
      //brute force O(n*n)
    /*
    for(int i = 0;i<arr.length-1;i++){
      for(int j = i+1;j<arr.length;j++){
        if(arr[i] + arr[j] == target) return new int[]{arr[i], arr[j]};
      }
    }
    return new int[]{-1, -1};
    */


        //using sorting and two pointer
    /*
    Arrays.sort(arr);
    int left = 0, right = arr.length-1;
    while(left<right){
      int sum = arr[left] + arr[right];
      if(sum == target) return new int[]{arr[left], arr[right]};
      else if(sum<target) left++;
      else right--;
    }
    return new int[]{-1, -1};
    */

          //using sorting and binary search
    /*
    Arrays.sort(arr);
    for(int i = 0;i<arr.length;i++){
      if(binarySearch(arr, target - arr[i], i) != -1) return new int[]{arr[i], arr[binarySearch(arr, target - arr[i], i)]};
    }
    return new int[-1, -1];
    */
            //using hashmap
    /*    
    HashMap<Integer, Integer> set = new HashMap<>();
    for(int i = 0;i<arr.length;i++){
      if(set.containsKey(target - arr[i])) return new int[] {target-arr[i], arr[i]};
      else set.put(arr[i], i);
    }
    return new int[]{-1, -1};
    */
  }
  /*
  static int binarySearch(int arr[], int x, int i){
    int left = 0, right = arr.length - 1;
    while(left<right){
      int m = (left+right)/2;
      if(arr[m] == x && i != m) return mid;
      else if(x>arr[m]) left = m+1;
      else right = m - 1;
    }
    return -1;
  }
  */


}
