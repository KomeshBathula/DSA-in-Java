import java.util.Scanner;

public class MergeSortedArraysTwoPointer {
    public static int[] mergeTwoPointer(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0,j=0,k=0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }
        while (i < n) merged[k++] = arr1[i++];
        while (j < m) merged[k++] = arr2[j++];
        return merged;
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
        
        int[] merged = mergeTwoPointer(arr1, arr2);
        System.out.println("Merged sorted array: " );
        for(int i:merged) System.out.print(i);
    }
}
