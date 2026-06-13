class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2 ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;

            while(j < k)
            {
                if(nums[i]+nums[j]+nums[k] == 0)
                {
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(nums[k]);
                    list.add(sublist);
                    int temp1 = nums[j];
                    int temp2 = nums[k];
                    while(j < k && nums[j] == temp1)
                    {
                        j++;
                    }
                    while(j < k && nums[k] == temp2)
                    {
                        k--;
                    }   

                }

                else if(nums[i]+nums[j]+nums[k] < 0)
                {
                    j++;
                }

                else
                {
                    k--;
                }
            }

        }

        return list;
    }
}