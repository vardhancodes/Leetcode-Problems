class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int minSum = 0;
        for(int i = 0 ; i < triangle.size() ; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < triangle.get(i).size(); j++)
            {
                if(min > triangle.get(i).get(j))
                {
                    min = triangle.get(i).get(j);
                }
            }
            minSum+=min;
        }
        return minSum;
    }
}