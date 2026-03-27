class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += checkdivisor(nums[i]);

        }
        return sum;
    }

    public static int checkdivisor(int n)
    {
        int div = 1;
        int sum = n+1;
        for(int i = 2 ; i*i <= n ; i++)
        {
            if(n%i == 0)
            {
                sum += i;
                if(!(i == n/i))
                {
                    sum += n/i;
                    div += 2;
                }
                div += 1;
                
            }
            if(div > 4)
            {
                return 0;
            }
        }
        if(div == 4)
        {
            return sum;
        }
        return 0;
    }
}