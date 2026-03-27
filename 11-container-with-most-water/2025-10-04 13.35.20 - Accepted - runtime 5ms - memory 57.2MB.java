class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int size = height.length;
        int end = size-1;
        int ans = 0;
        
        while(start<end)
        {
            int area = Math.min(height[start],height[end])*(end-start);
            ans = Math.max(ans,area);
            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }

        }
        return ans;
    }

        
}