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
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '2' || grid[i]
        [j] == '0')
        {
            return ;
        }

        grid[i][j] = '2';

        int di[] = {0,-1,1,0};
        int dj[] = {1,0,0,-1};

        for(int index = 0 ; index < 4 ; index++)
        {
            int newi = i + di[index];
            int newj = j + dj[index];

            recur(grid,newi,newj);
        }
    }
}