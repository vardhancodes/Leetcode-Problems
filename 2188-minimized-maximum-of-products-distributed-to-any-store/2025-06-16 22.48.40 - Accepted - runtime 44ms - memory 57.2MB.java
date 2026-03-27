class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int start = 1 ; 
        int res = -1;
        int end = Integer.MIN_VALUE;
        int size = quantities.length;

        for(int i = 0 ; i < size ; i ++)
        {
            if(end < quantities[i])
            {
                end = quantities[i];
            }
        }

        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(ispossible(n,quantities,mid))
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

    static boolean ispossible(int shops , int[] quantities, int max)
    {
        int distribution = 0 ;

        for(int i = 0 ; i < quantities.length ; i++)
        {
            distribution += quantities[i]/max;
            if(quantities[i]%max != 0)
            {
                distribution += 1;
            }

            if(distribution > shops)
            {
                return false;
            }

        }
        return true;
    }
}