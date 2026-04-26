class Solution {
    public boolean containsCycle(char[][] grid) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[i].length ; j++)
            {
               char parent = grid[i][j];
               if(!vis[i][j])
               { 
                    if(recur(vis,grid,i,j,-1,-1,parent))
                    {
                        return true;
                    }
               }
               
            }
        }
        return false;
    }

    public static boolean recur(boolean vis[][], char[][] grid, int i , int j, int previ , int prevj, char parent)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != parent)
        {
            return false;
        }


        if(vis[i][j])
        {
            if(!(i== previ && j == prevj))
            {
                return true;
            }
        }


        vis[i][j] = true;

        int di[] = {0,-1,1,0};
        int dj[] = {1,0,0,-1};

        //recursive calls

        for(int index = 0 ; index < 4 ; index++)
        {
            int ni = i+di[index];
            int nj = j+dj[index];

            if(ni == previ && nj == prevj)
            {
                continue;
            }
            if(recur(vis,grid,ni,nj,i,j,parent))
            {
                return true;
            }
        }

        return false;

    }


    
}