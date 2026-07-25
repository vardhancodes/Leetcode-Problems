class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];

        for(int[] rows : dp)
        {
            Arrays.fill(rows,-1);
        }

        return recur(n,m,text1,text2,dp);
    }

    public static int recur(int n, int m, String t1, String t2, int[][] dp)
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }

        if(dp[n][m] != -1)
        {
            return dp[n][m];
        }

        if(t1.charAt(n-1) == t2.charAt(m-1))
        {
            return dp[n][m] = 1+ recur(n-1,m-1,t1,t2,dp);
        }

        else
        {
            return dp[n][m] = Math.max(recur(n-1,m,t1,t2,dp),recur(n,m-1,t1,t2,dp));
        }

    }
}