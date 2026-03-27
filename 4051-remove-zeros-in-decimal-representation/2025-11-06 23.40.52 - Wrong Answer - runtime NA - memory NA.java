class Solution {
    public long removeZeros(long n) {
        long temp = 0;
        int count = 10;
        while(n!=0)
        {
            if(n%10 != 0)
            {
                if(temp == 0)
                {
                    temp = n%10;
                }
                else
                {
                    temp = (n%10)*count + temp;
                    count=count*10;
                }
            }
            n=n/10;
        }
        return temp;
    }
}