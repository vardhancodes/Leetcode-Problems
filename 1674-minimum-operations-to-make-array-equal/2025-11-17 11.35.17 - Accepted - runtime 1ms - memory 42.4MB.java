class Solution {
    public int minOperations(int n) {
        int i = 1;
        int j = n*2-1;
        int ans = 0;
        while(i<j)
            {
                ans+= (j+i)/2 - i;
                i+=2;
                j-=2;
            }
        return ans;
    }
}