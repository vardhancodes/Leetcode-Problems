class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i = 0 ; i < nums.size()-k*2; i++)
        {
            int cut = i+(2*k-1);
            if(isIncreasing(nums,i,cut,k))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isIncreasing(List<Integer> list , int start , int end, int k)
    {
        for(int i = start ; i < k ; i++)
        {
            if(list.get(i) > list.get(i+1) )
            {
                return false;
            }

        }
        for(int i = start+k ; i < end ; i++)
        {
           if(list.get(i) > list.get(i+1) )
            {
                return false;
            }  
        }
        return true;
    }
}