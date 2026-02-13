import java.util.Arrays;
import java.util.Scanner;
public class PairSumUnsortedVerifyTwoPointer {
    public static boolean hasPair(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int target =sc.nextInt();
        sc.close();
        System.out.println("Pair exists? " + hasPair(arr, target));
    }
}
