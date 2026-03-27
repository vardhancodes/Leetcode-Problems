class Solution {
    public int mySqrt(int x) 
    {
        long start = 0 ;
        long end = x;
        long ans=-1;
        

        if(x == 0)
        {
            return 0;
        }

        while(start <= end)
        {
           long mid = (start+(end-start)/2);
            
            if( (mid*mid) == x  )
            {
                return (int)mid;
                
            }
            else if((mid*mid) > x)
            {
                end = mid-1;
                

            }
            else
            {
                start = mid+1;
                ans = mid;
            }

        }
        return (int)ans;


    }
        
    
}