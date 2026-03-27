class Solution {
    public int distributeCandies(int[] candyType) {
        int target = candyType.length/2;
        int ans = 1;
        for(int i = 1 ; i < candyType.length ; i++)
        {
            if(candyType[i] != candyType[i-1] && ans < target)
            {
                ans++;
            }
            else
            {
                continue;
            }
        }
        return ans;
        
    }
}