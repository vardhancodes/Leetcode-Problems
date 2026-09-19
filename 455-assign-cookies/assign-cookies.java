class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        return recur(g,s,g.length,s.length);
    }

    public int recur(int[] g, int[] s, int n, int m)
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }

        if(g[n-1] <= s[m-1])
        {
            return 1 + recur(g,s,n-1,m-1);
        }

        else 
        {
            return recur(g,s,n-1,m);
        }
    }
}