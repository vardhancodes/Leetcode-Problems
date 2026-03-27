class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int prevmax  = neededTime[0];
        for(int i = 1; i < colors.length() ; i++ )
        {
             char ch =  colors.charAt(i);
             char nextch = colors.charAt(i-1);
            if(ch == nextch)
             {
                 ans+=
                     Math.min(neededTime[i],prevmax);
                 prevmax = Math.max(neededTime[i],prevmax);
             }
            else 
            {
                prevmax = neededTime[i];
            }
        }
        return ans;
    }
}