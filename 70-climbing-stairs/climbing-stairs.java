class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;

        if(n == 1 || n == 2)
        {
            return n;
        }

        for(int i = 2; i < n ; i++)
        {
            int temp = b;
            b = a+b;
            a = temp;

        } 

        return b;


        
    }

    
}