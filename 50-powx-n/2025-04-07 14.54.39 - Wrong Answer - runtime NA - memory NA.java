class Solution {
    public double myPow(double x, int n) {
        double result=1;
        if(n<0)
        {
            n = -1*n;
            x=1/x;
        }
        while (n>0)
        {
            if(n%2!=0)
            {
                result = result * x;

            }
            n/=2;
            x = x*x;
            
        }
        return result;

    }
}