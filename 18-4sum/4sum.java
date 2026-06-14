class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 4)
        {
            return list;        
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-3 ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j = i+1 ; j < nums.length-2 ; j++)
            {
                if(j > i + 1 && nums[j] == nums[j - 1])
                {
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;

                while(k < l)
                {
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target)
                    {
                        List<Integer> sublist = new ArrayList<>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[k]);
                        sublist.add(nums[l]);
                        list.add(sublist);
                        int temp1 = nums[k];
                        int temp2 = nums[l];
                        while(k < l && nums[k] == temp1)
                        {
                            k++;
                        }
                        while(k < l && nums[l] == temp2)
                        {
                            l--;
                        }
                    }

                    else if(sum > target)
                    {
                        l--;
                    }

                    else
                    {
                        k++;
                    }
                }
               
            }
        }

        return list;
    }
}