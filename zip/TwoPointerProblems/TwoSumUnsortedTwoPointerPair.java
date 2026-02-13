import java.util.*;

public class TwoSumUnsortedTwoPointerPair {
    public static int[] getPairWithZero(int[] arr) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) return new int[]{arr[left], arr[right]};
            else if (sum < 0) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = getPairWithZero(arr);
        System.out.println("Pair: " + result[0] + " " + result[1]);
    }
}