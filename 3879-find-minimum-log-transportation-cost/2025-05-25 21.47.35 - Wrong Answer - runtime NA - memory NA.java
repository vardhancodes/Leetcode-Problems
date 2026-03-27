class Solution {
    public long minCuttingCost(int n, int m, int k) {

        if(n <= k && m <= k)
        {
            return 0;
        }
        if(n > k)
        {
            int len1 = n-k;
            int len2 = k;

            int x = len1*len2;

            return x;
        }
        if( m > k)
        {
            int len1 = m-k;
            int len2 = k;

            int x = len1*len2;

            return x;
        }

        return 0;

        
        
    }
}