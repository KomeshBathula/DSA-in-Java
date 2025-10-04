import java.util.Scanner;

public class TwoSumSortedTwoPointerIndices {
    public static int[] getPairIndices(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) return new int[]{left, right};
            else if (sum < 0) left++;
            else right--;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sorted array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = getPairIndices(arr);
        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}
