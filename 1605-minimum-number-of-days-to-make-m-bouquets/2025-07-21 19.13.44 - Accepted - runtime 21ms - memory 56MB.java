class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans = -1;
        if(bloomDay.length < m*k)
        {
            return ans;
        }
        int start = 1;
        int end = bloomDay[0];
        for(int i = 0 ; i < bloomDay.length ; i++)
        {
            if(end < bloomDay[i])
            {
                end = bloomDay[i];
                
            }
        }
        while(start <= end)
        {
            int mid = (start+(end-start)/2);
            if(isBouquetpossible(bloomDay, m , k , mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return ans;

        
    }
    static boolean isBouquetpossible(int[] arr,int  m ,int  k ,int  day)
    {
        int currentflower = 0 ;
        int bouquets = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] <= day)
            {
                currentflower++;
            }
            else
            {
                currentflower=0;
            }
            if(currentflower == k)
            {
                bouquets++;
                currentflower = 0;
            }
            if(bouquets >= m)
            {
                return true;

            }
        }
        return false;
    }
}