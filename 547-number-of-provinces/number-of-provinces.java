class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean vis[] = new boolean[isConnected.length];
        int ans = 0;
        for(int i = 0 ; i < vis.length ; i++)
        {
            if(!vis[i])
            {
                ans++;
                recur(isConnected,vis,i);
            }
        }

        return ans;
    }

    public void recur(int[][] m, boolean[] vis, int i)
    {
        vis[i] = true;

        for(int ind = 0 ; ind < m.length ; ind++)
        {
            if(m[i][ind] == 1 && !vis[ind])
            {
                recur(m,vis,ind);
            }

        }
    }
}