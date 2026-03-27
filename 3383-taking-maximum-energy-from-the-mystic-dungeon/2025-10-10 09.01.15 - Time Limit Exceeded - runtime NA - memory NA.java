class Solution {
    public int maximumEnergy(int[] energy, int k) { 
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < energy.length ; i++)
        {
              int max = 0;
            for(int j = i ; j< energy.length ; j +=k)
                {
                    max += energy[j];
                    
                }
            ans=Math.max(max,ans);
            
        }
        return ans;
    }
}