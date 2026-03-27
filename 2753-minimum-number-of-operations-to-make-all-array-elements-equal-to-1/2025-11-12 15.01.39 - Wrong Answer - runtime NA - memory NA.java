class Solution {
    public int minOperations(int[] nums) {
        int ans = 0 ;
        int count = 1;
        for(int i = 0 ; i < nums.length-1 ; i++)
        {
            if(gcd(nums,nums[i],nums[i+1]) == 1)
            {
                ans++;
            }
            count++;
        }
        if(ans!=0)
        {
            ans += count-ans;
        }
        return (ans==0)?-1:ans;
    }
    public static int gcd(int[] nums , int n1 , int n2)
    {
        int len = Math.max(n1,n2);
        int ans = -1;
        for(int i = 1 ; i <= len ; i++)
        {
            if(n1%i == 0 && n2%i == 0)
            {
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}