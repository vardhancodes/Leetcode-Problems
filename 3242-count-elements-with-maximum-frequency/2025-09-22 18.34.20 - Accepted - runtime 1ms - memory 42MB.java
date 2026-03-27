class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
        }

        int count[] = new int[max+1];
        for(int i = 0 ; i < nums.length ; i++)
        {
            count[nums[i]]++;
        }
        
        int maxfreq = Integer.MIN_VALUE;

        for(int i = 0 ; i < count.length ; i++)
        {
            if(maxfreq < count[i])
            {
                maxfreq = count[i];
            }
        }
        int sum = 0;

        for(int i = 0 ; i < count.length ; i++)
        {
            if(maxfreq == count[i])
            {
                sum+= maxfreq;
            }
        }  

        return sum;      
        
    }
}