class Solution {
    public int smallestNumber(int n) {
        int count = 1;
        while(Math.pow(2,count) <= n)
        {
            count++;
        }
        int ans = (int)Math.pow(2,count);
        return ans-1;
    }
}