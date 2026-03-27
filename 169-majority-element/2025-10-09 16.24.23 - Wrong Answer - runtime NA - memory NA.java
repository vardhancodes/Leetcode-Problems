class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int Melement = nums[0];

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(count == 0)
            {
                Melement = nums[i];
                count =1;
            }
            if(Melement == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }

           
        }
        return Melement;
    }

}