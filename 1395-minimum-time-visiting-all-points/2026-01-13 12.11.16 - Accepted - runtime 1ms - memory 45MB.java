class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i = 0 ; i < points.length-1 ; i++)
        {
           int diff1 =  (points[i][0] < points[i+1][0])?points[i+1][0] - points[i][0] : points[i][0] - points[i+1][0];
           int diff2 =  (points[i][1] < points[i+1][1])?points[i+1][1] - points[i][1] : points[i][1] - points[i+1][1];

           sum += Math.max(diff1,diff2);
        }
        return sum;
    }
}