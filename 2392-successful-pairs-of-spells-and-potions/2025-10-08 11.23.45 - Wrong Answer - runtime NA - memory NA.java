class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length; 
        int m = potions.length;
        int []ans = new int[n];
        

        for(int i = 0 ; i < n ; i++)
        {
            
            int mul = spells[i];
            for(int j = 0 ; j < m ; j++)
            {
                int num = potions[j]*mul; 
                if(num >= success)
                {
                    ans[i]++;
                }
            }
        }
        return ans;
        
    }
}