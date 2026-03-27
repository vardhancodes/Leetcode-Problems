class Solution {
    public int mySqrt(int x) 
    {
        int start = 0 ;
        int end = x;
        int ans=-1;
        int mid = -1;

        if(x == 0)
        {
            return 0;
        }

        while(start <= end)
        {
            mid = (start+(end-start)/2);
            
            if( ((long)(mid*mid)) == x  )
            {
                return mid;
                
            }
            else if( ((long)(mid*mid)) > x)
            {
                end = mid-1;
                

            }
            else
            {
                start = mid+1;
                ans = mid;
            }

        }
        return ans;


    }
        
    
}