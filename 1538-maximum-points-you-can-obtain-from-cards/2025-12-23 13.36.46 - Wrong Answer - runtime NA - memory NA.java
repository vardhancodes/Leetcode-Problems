class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0 ; i < k ; i++)
        {
            sum += cardPoints[i];
        }
        int n = cardPoints.length;
        int ans = sum;
        for(int i = 1 ; i <= n-k ; i++)
        {
            sum -= cardPoints[i];
            sum += cardPoints[i+k-1];
            ans = Math.max(ans,sum);

        }
        return ans;

    }
}