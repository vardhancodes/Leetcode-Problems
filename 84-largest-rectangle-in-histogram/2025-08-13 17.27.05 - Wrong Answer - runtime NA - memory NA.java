class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsmall = new int[n];
        int[] psmall = new int[n];
        Stack<Integer> stack = new Stack<>();

        //For next smaller:
        for(int i = n-1 ; i >= 0 ; i --)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                nsmall[i] = n;
            }
            else
            {
                nsmall[i] = stack.peek();
            }
            stack.push(i);
        }

        //For previous smaller:
        for(int i = 0 ; i < n ; i ++)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                psmall[i] = -1;
            }
            else
            {
                psmall[i] = stack.peek();
            }
            stack.push(i);
        }

        //For max:
        int max = Integer.MIN_VALUE;
        int area = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            area = heights[i] * (nsmall[i] - psmall[i] - 1);
            if(area > max)
            {
                max = area;
            }
        }

        return max;



        
    }
}