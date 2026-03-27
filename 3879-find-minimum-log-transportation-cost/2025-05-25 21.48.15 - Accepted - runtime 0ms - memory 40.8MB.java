class Solution {
    public long minCuttingCost(int n, int m, int k) {

        if(n <= k && m <= k)
        {
            return 0;
        }
        if(n > k)
        {
            long len1 = n-k;
            long len2 = k;

            long x = len1*len2;

            return x;
        }
        if( m > k)
        {
            long len1 = m-k;
            long len2 = k;

            long x = len1*len2;

            return x;
        }

        return 0;

        
        
    }
}