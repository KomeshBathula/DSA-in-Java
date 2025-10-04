import java.util.*;

public class TwoSumUnsortedTwoPointerIndices {
    public static int[] getPairIndices(int[] arr) {
        int n = arr.length;
        int[] copy = Arrays.copyOf(arr, n);
        Arrays.sort(copy);

        int left = 0, right = n - 1;
        int num1 = -1, num2 = -1;

        while (left < right) {
            int sum = copy[left] + copy[right];
            if (sum == 0) {
                num1 = copy[left];
                num2 = copy[right];
                break;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        if (num1 == -1) return new int[]{-1, -1};

        int index1 = -1, index2 = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num1 && index1 == -1) index1 = i;
            else if (arr[i] == num2 && index2 == -1) index2 = i;
        }

        return new int[]{index1, index2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = getPairIndices(arr);
        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}
