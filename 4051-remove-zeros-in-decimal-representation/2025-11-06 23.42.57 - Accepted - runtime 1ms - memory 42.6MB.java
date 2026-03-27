class Solution {
    public long removeZeros(long n) {
        long temp = 0;
        long count = 1;
        while(n!=0)
        {
            if(n%10 != 0)
            {
                temp = (n%10)*count + temp;
                count=count*10;
                
            }
            n=n/10;
        }
        return temp;
    }
}