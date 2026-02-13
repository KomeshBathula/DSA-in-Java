import java.util.Arrays;
import java.util.Scanner;

public class SortSquaresBruteForce {
    public static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = arr[i]*arr[i];
        }
        Arrays.sort(squares);
        return squares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] res = sortSquares(arr);
        System.out.println("Sorted squares: ");
        for(int i:res) System.out.print(i+" ");
    }
}
