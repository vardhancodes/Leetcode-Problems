class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int m = grid[i].length;
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == '1')
                {
                    recur(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void recur(char[][] grid, int i , int j )
    {
        if(i < 0 || i >= grid.length || j < 0 || j >=grid[i].length || grid[i][j] == '0' || grid[i][j] == '2')
        {
            return;
        }

        grid[i][j] = '2';

        int di[] = {1,0,0,-1};
        int dj[] = {0,-1,1,0};


        for(int ind = 0 ; ind < 4 ; ind++)
        {
            recur(grid, i+di[ind], j+dj[ind]);

        }


    }
}