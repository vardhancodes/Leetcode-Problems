class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i++)
        {
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0 ; i < nums1.length ; i++)
        {
            if(map.containsKey(nums1[i]))
            {
                if(min > nums1[i])
                {
                    min = nums1[i];
                    ans = min;
                }
            }
        }
        return ans;

        
        
    }
}