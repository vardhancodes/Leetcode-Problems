class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(dp,n);

    }

    public static int recur(int[] dp, int n)
    {
        if(n == 0 || n == 1)
        {
            dp[n] = n;
            return dp[n];
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }

        dp[n] = recur(dp,n-1) + recur(dp, n-2);
        return dp[n];
    }
}