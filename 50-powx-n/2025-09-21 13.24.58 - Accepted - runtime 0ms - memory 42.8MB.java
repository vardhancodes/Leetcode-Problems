class Solution {
    public double myPow(double x, int n) {
        if(n<0)
        {
            x=1/x;
        }
        return recur(x,n);
        
    }
    public static double recur(double x , int n )
    {
        if(n==0)
        {
            return 1.0;
        }
        if(n%2 != 0)
        {
            return x*recur(x*x,n/2);
        }
        return recur(x*x,n/2);

        
    }
}