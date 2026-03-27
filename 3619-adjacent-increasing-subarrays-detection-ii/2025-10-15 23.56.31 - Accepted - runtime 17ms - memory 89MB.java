class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums){
        int cnt = 1;
        int prevcnt = 0;
        int ans = 0 ; 
        for(int i = 1 ; i < nums.size() ; i++)
        {
            if(nums.get(i) > nums.get(i-1))
            {
                cnt++;
            }
            else
            {
                prevcnt = cnt;
                cnt = 1;
            }
            ans = Math.max(ans,Math.min(prevcnt,cnt));
            ans = Math.max(ans,cnt/2);
        }

        return ans;

        
    

    }


    
}