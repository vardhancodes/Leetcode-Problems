class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int rlargest[] = new int[nums.length];
        int n = nums.length;
        int r = Integer.MIN_VALUE;
        for(int i = n-1 ; i >= 0 ; i--)
        {
            rlargest[i] = r;
            if(nums[i] > r)
            {
                r = nums[i];
            }
        }

        int l = nums[0];
        list.add(nums[0]);

        for(int i = 1 ; i < nums.length-1 ; i++)
        {
            if(nums[i] > l || nums[i] > rlargest[i])
            {
                list.add(nums[i]);
                l = nums[i];
            }
        }

        if(nums.length > 1)
        {
            list.add(nums[nums.length-1]);
        }

        return list;


    }
}