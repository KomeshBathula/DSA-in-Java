import java.util.Arrays;
import java.util.Scanner;
public class TwoSumUnsortedTwoPointerExists {
    public static boolean hasPairWithZero(int[] arr) {
        Arrays.sort(arr); 
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) return true;
            else if (sum < 0) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Pair exists : " + hasPairWithZero(arr));
    }
}
