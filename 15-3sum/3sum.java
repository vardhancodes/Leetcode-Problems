class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        while(i <= nums.length-3)
        {
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
            int temp1 = nums[i];
            while(i < nums.length && nums[i] == temp1)
            {
                i++;
            }
        }

        return list;
    }
}