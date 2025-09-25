import java.util.Scanner;
import java.util.Stack;
public class BuildingFacingSun {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
    System.out.println(countBuildingsUsingForLoop(arr,n));
    sc.close();
  }

  static int countBuildingsUsingForLoop(int arr[], int n){
    int max = arr[0];
    int count = 1;
    for(int i = 1;i<n;i++){
      if(arr[i]>max){
        count++;
        max = arr[i];
      }
    }
    return count;
  }

  static int countBuildingsUsingStack(int arr[], int n){
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    for(int i = 0;i<n;i++){
      if(stack.peek()<arr[i]) stack.push(arr[i]);
    }
    return stack.size();
  }
}
