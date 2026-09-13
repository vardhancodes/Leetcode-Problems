class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[i].length ; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    recur(grid,i,j);
                }
            }
        }

        return count;

    }

    public static void recur(char grid[][] , int i , int j)
    {
        grid[i][j] = '2';

        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};

        for(int ind = 0 ; ind < 4 ; ind++)
        {
            int ni = i+di[ind];
            int nj = j+dj[ind];

            if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && grid[ni][nj] == '1')
            {
                recur(grid,ni,nj);
            }

        }

    }
}