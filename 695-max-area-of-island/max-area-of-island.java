class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];

        for(int i = 0 ; i < vis.length ; i++)
        {
            for(int j = 0 ; j < vis[i].length ; j++)
            {
                if(!vis[i][j] && grid[i][j] == 1)
                {
                    max = Math.max(dfs(vis,grid,i,j,1),max);
                }
            }
        }

        return max;
    }

    public int dfs(boolean[][] vis, int[][] grid, int i, int j, int area)
    {
        vis[i][j] = true;

        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};

        for(int ind = 0 ; ind < 4 ; ind++)
        {
            int ni = i+di[ind];
            int nj = j+dj[ind];

            if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && !vis[ni][nj]  && grid[ni][nj] != 0)
            {
                area = 1+dfs(vis,grid,ni,nj,area);
            }
        }  

        return area;
    }
}