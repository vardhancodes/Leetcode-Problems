class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int start = 0;
        int end = cardPoints.length-1;
        while( k > 0)
        {
            sum+= Math.max(cardPoints[start],cardPoints[end]);
            start++;
            end--;
            k--;
        }
        return sum;

    }
}