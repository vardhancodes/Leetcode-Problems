class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        {
            return false;
        }
        return (recur(n)==0);
        
    }
    public static int recur(int n)
    {
        if(n<=0)
        {
            return n;
        }
        return recur(n/3);
        
    }
}