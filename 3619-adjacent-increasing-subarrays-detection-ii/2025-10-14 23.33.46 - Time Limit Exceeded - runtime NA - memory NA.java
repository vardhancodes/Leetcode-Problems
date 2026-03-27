class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int start = 1;
        int end = nums.size()/2;
        int ans = 0;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(isIncreasing(nums,mid))
            {
                ans = mid;
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }

    public static boolean isIncreasing(List<Integer> list , int mid)
    {
        int k = mid*2;
        for(int i = 0 ; i <= list.size()-k ; i++)
        {
            //first half
            boolean first = true;
            boolean second = true;
            for(int j = i ; j < i+mid-1 ; j++)
            {
                if(list.get(j) >= list.get(j+1))
                {
                    first = false;
                    break;

                }
            }
            //second half
            for(int s = i+mid ; s < i+k-1  ; s++)
            {
                if(list.get(s) >= list.get(s+1))
                {
                    second = false;
                    break;

                }
            }
            if(first &&  second)
            {
                return true;
            }
        }
        return false;

    }
}