class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int size = height.length;
        int end = size-1;
        int maxarea = 0;

        while( start < end)
        {
            int currentheight = Math.min(height[start], height[end]);
            int currentwidth = Math.abs(start-end);
            maxarea = Math.max(maxarea , currentheight * currentwidth);

            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return maxarea;

    }

        
}