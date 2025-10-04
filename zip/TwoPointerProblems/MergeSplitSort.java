import java.util.Arrays;
import java.util.Scanner;

public class MergeSplitSort {

    public static void mergeAndSplit(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        for (int i = 0; i < n; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < m; i++) {
            merged[n + i] = arr2[i];
        }

        Arrays.sort(merged);
        for (int i = 0; i < n; i++) arr1[i] = merged[i];
        for (int i = 0; i < m; i++) arr2[i] = merged[n + i];

        System.out.println("First array after split: " );
        for(int i:arr1) System.out.print(i);
        System.out.println("Second array after split: " );
        for(int i:arr2) System.out.print(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first sorted array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second sorted array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        mergeAndSplit(arr1, arr2);
    }
}
