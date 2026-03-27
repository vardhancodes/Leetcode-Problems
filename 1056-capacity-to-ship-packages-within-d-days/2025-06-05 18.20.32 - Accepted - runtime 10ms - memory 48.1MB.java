class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int res = -1;
        int start = weights[0];
        int end = 0;

        for(int i = 0 ; i < weights.length ; i++)
        {
            if(weights[i] > start)
            {
                start = weights[i]; 
            }
            end += weights[i];
        }

        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if(isshipmentpossible(mid,days,weights))
            {
                res = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return res;
        
    }
    static boolean isshipmentpossible(int maxweight , int days , int []weights) 
    {
        int currentday = 1;
        int capacity = 0 ;

        for(int i =  0 ; i < weights.length ; i++)
        {
            capacity += weights[i];
            if(capacity > maxweight)
            {
                currentday++;
                capacity = weights[i];
            }
            if(currentday > days)
            {
                return false;
            }
        }
        return true;
    }
}