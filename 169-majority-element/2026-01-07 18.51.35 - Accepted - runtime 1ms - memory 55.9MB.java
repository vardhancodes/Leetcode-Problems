class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int Melement = nums[0];
        for(int i = 1 ; i < nums.length; i++)
        {
            if(count == 0)
            {
                Melement = nums[i];
                count = 1;
            }
            else
            {
                if(Melement != nums[i])
                {
                    count--;
                }
                else
                {
                    count++;
                }
            }
        }
        return Melement;
    }

}