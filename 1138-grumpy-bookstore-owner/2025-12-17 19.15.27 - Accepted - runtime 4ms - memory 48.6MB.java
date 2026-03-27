class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //creating a window
        int base = 0;
        int max = 0;
        int ans = 0;
        int n = customers.length;
        for(int i = 0 ; i < minutes ; i++)
        {
            if(grumpy[i] == 1)
            {
                max += customers[i];
            }
        }
        ans = Math.max(ans,max);
        for(int i = 0 ; i < n ; i++)
        {
            if(grumpy[i] == 0)
            {
                base += customers[i];
            }
        }
        for(int i = 1 ; i <= n - minutes ; i++)
        {
            if(grumpy[i+minutes-1] == 1)
            {
                max += customers[i+minutes-1];
            }
            if(grumpy[i-1] == 1)
            {
                max -= customers[i-1];
            }  
            ans = Math.max(ans,max);
        }
        return ans+base;
        
    }
}