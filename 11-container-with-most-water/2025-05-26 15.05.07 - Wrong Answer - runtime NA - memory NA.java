class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int size = height.length;
        int end = size-1;

        if(size == 2)
        {
            int result = Math.min(height[start],height[end]);
            return result*result;
        }

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

        int ans = Math.min(height[start],height[end]);


        return ans*(Math.abs(start-end));
    }
}