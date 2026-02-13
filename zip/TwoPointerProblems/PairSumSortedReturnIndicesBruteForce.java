import java.util.Scanner;
public class PairSumSortedReturnIndicesBruteForce {
    public static int[] findIndices(int[] arr, int target) {
        for (int i=0;i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++)
                if (arr[i] + arr[j] == target) return new int[]{i, j};
        return null;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int target =sc.nextInt();
        sc.close();
        int[] idx = findIndices(arr,target);
        System.out.println(idx==null ? "No pair" : ("Indices: " + idx[0] + ", " + idx[1]));
    }
}
