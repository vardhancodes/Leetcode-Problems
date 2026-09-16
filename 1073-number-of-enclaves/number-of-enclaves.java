class Solution {
    public int numEnclaves(int[][] grid) {
        int ans = 0;
        //rows
        for(int j = 0 ; j < grid[0].length ; j++)
        {
            if(grid[0][j] == 1)
            {
                dfs(grid,0,j);
            }
            if(grid[grid.length-1][j] == 1)
            {
                dfs(grid,grid.length-1,j);
            }
        }

        //columns

        for(int i = 1 ; i < grid.length-1 ; i++)
        {
            if(grid[i][0] == 1 )
            {
                dfs(grid,i,0);
            }
            if(grid[i][grid[0].length-1] == 1)
            {
                dfs(grid,i,grid[0].length-1);
            }
        }


        for(int i = 0 ; i < grid.length; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == 1)
                {
                    ans++;
                }
            }
        }

        return ans;
    }

    public void dfs(int [][] grid, int i, int j)
    {
        grid[i][j] = -1;

        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};

        for(int ind = 0 ; ind < 4 ; ind++)
        {
            int ni = i+di[ind];
            int nj = j+dj[ind];

            if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && grid[ni][nj] == 1)
            {
                dfs(grid,ni,nj);
            }
        }

    }
}