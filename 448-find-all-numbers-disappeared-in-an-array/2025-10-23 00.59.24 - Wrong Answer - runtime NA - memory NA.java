class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++)
        {
            if(nums[i] == nums[i+1] || nums[i]+1 == nums[i+1])
            {
                continue;
            }
            else
            {
                int k = nums[i+1]-nums[i];
                int count =1;
                while(k!=1)
                {
                    list.add(nums[i]+count);
                    count++;
                    k--;
                }
            }
        }
        if(list.size() == 0)
        {
            list.add(nums[nums.length-1]+1);
        }
        return list;
    }
}