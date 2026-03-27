class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        {
            return false;
        }
        return (recur(n,1)==n);
        
    }
    public static int recur(int n , int ind)
    {
        if(ind >= n)
        {
            return ind;
        }
        return recur(n,ind*3);
        
    }
}