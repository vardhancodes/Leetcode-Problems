class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        int count = 1;
        while(n != 0)
        {
            if(n%10 > 0)
            {

                x = (n%10)*count + x;
                count = count*10;
                sum += n%10;
            }
            n /= 10;
        }
        return sum*x;
    }
}