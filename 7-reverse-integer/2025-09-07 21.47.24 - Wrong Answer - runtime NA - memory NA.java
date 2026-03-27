class Solution {
    public int reverse(int x) {
    return rec(x,0);
    }
    
    public static int rec(int num , int res)
    {
        if(num == 0)
        {
            return res;
        }
        res = res*10 + num%10;
        if(res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10)
        {
            return 0;
        }
        return rec(num/10 , res);
    }
}