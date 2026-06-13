package QuickSort;

import java.util.Scanner;

public class kthLargest {
    private static int quickSelect(int[] arr, int low, int high) {
        int pivot = arr[high];
        int ploc = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[ploc];
                arr[ploc] = temp;

                ploc ++;
            }
        }

        int temp = arr[high];
        arr[high] = arr[ploc];
        arr[ploc] = temp;

        return ploc;
    }
    private static int kthLarge(int[] arr, int low, int high, int k) {
        int pos = quickSelect(arr, low, high);

        if (pos == arr.length - k) 
            return arr[arr.length - k];
        else if (pos < arr.length - k) 
            return kthLarge(arr, pos + 1, high, k);
        else
            return kthLarge(arr, 0, pos - 1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int[] arr = {10, 7, 2, 5, 9, 8, 3, 1};

        int k = sc.nextInt();
        System.out.print(kthLarge(arr, 0, n - 1, k));
        sc.close();
    }
}
