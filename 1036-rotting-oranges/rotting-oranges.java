class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        int ans = 0; 
        int fresh = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[i].length ; j++)
            {
                if(grid[i][j] == 2)
                {
                    ArrayList<Integer> sublist = new ArrayList<>();
                    sublist.add(i);
                    sublist.add(j);
                    q.add(sublist);
                }

                if(grid[i][j] == 1)
                {
                    fresh++;
                }
            }
        }

        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};

        while(!q.isEmpty() && fresh > 0)
        {
            int size = q.size();

            for(int k = 0 ; k < size ; k++)
            {
                ArrayList<Integer> list = q.poll();
                int pi = list.get(0);
                int pj = list.get(1);
                
                for(int ind = 0 ; ind < 4 ; ind++)
                {
                    int ni = pi+di[ind];
                    int nj = pj+dj[ind];

                    if(ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length && grid[ni][nj] == 1)
                    {
                        ArrayList<Integer> l1 = new ArrayList<>();
                        grid[ni][nj] = 2;
                        fresh--;
                        l1.add(ni);
                        l1.add(nj);
                        q.add(l1);
                    }

                }
            }
            ans++;

            
        }

        if(fresh > 0)
        {
            return -1;
        }

        return ans;
    }
}