class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int size = height.length;
        int end = size-1;

        while (true)
        {
            if(height[start] < height[end] && height[start] < height[start+1])
            {
                start++;
            }
            else if (height[end] < height[start] && height[end] < height[end-1])
            {
                end = end - 1;
            }
            else
            {
                break;
            }
        }

        return (height[start] >= height[end])?height[end]*height[end]:height[start]*height[start];
    }
}