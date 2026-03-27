class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int psmall[] = new int[n];
        int nsmall[] = new int[n];
        //for previous smaller
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++)
        {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()])
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
            System.out.print(psmall[i] + " " );
        }
        stack.clear();
        System.out.println();
        //for next smaller
        for(int i = n-1 ; i >= 0 ; i--)
        {
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()])
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
            System.out.print(nsmall[i] + " " );
        }
        int max = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int area = heights[i]*(nsmall[i] - psmall[i]-1);
            
            max = Math.max(max,area);
        }
        return max;
    }
}