class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        for(int i = 0; i < colors.length()-1 ; i++ )
        {
             char ch =  colors.charAt(i);
             char nextch = colors.charAt(i+1);
            if(ch == nextch)
             {
                 ans+= Math.min(neededTime[i],neededTime[i+1]);
             }
        }
        return ans;
    }
}