class Solution {
    public int maximumEnergy(int[] energy, int k) { 
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
              int max = 0;
            for(int j = 0 ; j + k < n ; j=j+k)
                {
                    max += energy[i];
                    
                }
            ans=Math.max(max,ans);
            
        }
        return ans;
    }
}