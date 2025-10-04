import java.util.Scanner;
public class PairSumUnsortedReturnElementsBruteForce {
    public static int[] findPair(int[] arr, int target) {
        for (int i=0;i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++)
                if (arr[i] + arr[j] == target) return new int[]{arr[i], arr[j]};
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
        int p[]=findPair(arr,target);
        if (p == null) System.out.println("No pair");
        else System.out.println("Pair: " + p[0] + ", " + p[1]);
    }
}
