package DynamicProgrammiing;

import java.util.Scanner;

public class CountWays {
    private static int helper(int i, int j, String source, String target, int[][] dp) {
        if (i == source.length()) return 1;
        if (j >= target.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int ways = helper(i, j + 1, source, target, dp);

        if (source.charAt(i) == target.charAt(j)) {
            ways += helper(i + 1, j + 2, source, target, dp);
        }
        return dp[i][j] = ways;
    }
    private static int helper(int i, int j, String source, String target) {
        if (i == source.length()) return 1;
        if (j >= target.length()) return 0;

        int ways = helper(i, j + 1, source, target);

        if (source.charAt(i) == target.charAt(j)) {
            ways += helper(i + 1, j + 2, source, target);
        }
        return ways;
    }
    private static int countWays(String source, String target) {
        // recursion approach
        // return helper(0, 0, source, target);
        // memoization approach
        int[][] dp = new int[source.length() + 1][target.length() + 1];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        return helper(0, 0, source, target, dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        String target = sc.next();
        int count = countWays(source, target);
        System.out.println(count);
        sc.close();
    }    
}
