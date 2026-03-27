class Solution {
    public double myPow(double x, int n) {
        double result=1;
        if(n<0)
        {
            n = -1*n;
            x=1/x;
        }
        for(int i =0; i<n ; i++)
        {
            result = result*x;
        }

        return result;
    }
}