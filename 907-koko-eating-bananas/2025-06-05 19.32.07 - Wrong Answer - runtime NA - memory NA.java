class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
    int res = -1;
    int start = 1;
    int end = Integer.MIN_VALUE;

    for(int i = 0 ; i < piles.length ; i++)
    {
        if(piles[i]>end)
        {
            end = piles[i];
        }
    }

    while(start <= end)
    {
        int mid = (start+(end-start)/2);
        if(ispossible(mid , h , piles))
        {
            end = mid-1;
            res = mid;
        }
        else
        {
            start = mid+1;
        }
    }
    return res;

}
static boolean ispossible(int max , int hours , int[]piles)
{
    int ans = 0;
    for(int i = 0 ; i < piles.length ; i++)
    {
        ans += (piles[i]/max);
        if(piles[i]%max != 0)
        {
            ans += 1;
            
        }
    }
    if(ans > hours)
    {
        return false;
    }
    return true;
}
}