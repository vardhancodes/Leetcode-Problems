class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length; 
        int m = potions.length;
        int []ans = new int[n];
        Arrays.sort(potions);
        for(int i = 0 ; i < n ; i++)
        {
            int start = 0;
            int end = m-1;
            while(start <= end)
            {
                int mid = (start)+(end-start)/2;
                if(potions[mid]*spells[i] == success)
                {
                    ans[i] = (m-mid);
                    break;
                }
                else if(potions[mid]*spells[i] > success)
                {
                    ans[i] = (m-mid);
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
                
            }
            
        }

        return ans;

       
        

    }
}