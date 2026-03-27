class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int mid = start+(end-start)/2;
        while(start < mid && mid < end)
        {
            if(nums[start] + nums[end] + nums[mid] == 0)
            {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(nums[start]);
                sublist.add(nums[end]);
                sublist.add(nums[mid]);
                list.add(sublist);
                start++;
                mid++;
                end--;
            }
            if(nums[start] + nums[end] + nums[mid] > 0)
            {
                end--;
            }
            if(nums[start] + nums[end] + nums[mid] < 0)
            {
                start++;
            }
        }
        return list;
    }
}