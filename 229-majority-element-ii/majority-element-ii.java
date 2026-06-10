class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count = nums.length/3;

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > count)
            {
                list.add(entry.getKey());
            }
        }

        return list;

    }
}