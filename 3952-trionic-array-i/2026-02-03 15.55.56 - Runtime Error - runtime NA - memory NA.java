class Solution {
    public boolean isTrionic(int[] nums) {
        int p  = 0;
        int q = 0 ; 
        int t = 0;
        while( p < nums.length && nums[p] < nums[p+1])
        {
            p++;
        }
        if(p == 0) return false;
        q = p;
        while(q < nums.length && nums[q] > nums[q+1])
        {
            q++;
        }
        if( q == p) return false;
        t = q;
        while( q < nums.length-1 && nums[q] < nums[q+1])
        {
            q++;
        }
        if(q == t)
        {
            return false;
        }
        return true;
    }
}