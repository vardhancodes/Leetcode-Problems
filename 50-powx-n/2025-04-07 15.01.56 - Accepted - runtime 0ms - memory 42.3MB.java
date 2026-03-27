class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        long N= n;
        if (N<0)
        {
            N =-1*N;
            x= 1/x;

        }
        while(N>0)
        {
            if(N%2!=0)
            {
                result = result*x;

            }
            N/=2;
            x=x*x;
        
    }
    return result;
}
}