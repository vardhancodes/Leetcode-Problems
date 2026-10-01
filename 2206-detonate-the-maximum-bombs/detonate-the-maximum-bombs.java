class Solution {
    public int maximumDetonation(int[][] bombs) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean vis[] = new boolean[bombs.length];
        for(int i = 0 ; i < bombs.length ; i++)
        {
            list.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i < bombs.length ; i++)
        {

            long x1 = bombs[i][0];
            long y1 = bombs[i][1];
            long r = bombs[i][2];

            for(int j = 0 ; j < bombs.length ; j++)
            {
                if(i == j)
                {
                    continue;
                }
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];
               

                double dist = (((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));

                if(dist <= r*r)
                {
                    list.get(i).add(j);
                }
            }
        }

        int ans = 0;
        int[] max = new int[1];
        for(int i = 0 ; i < vis.length ; i++)
        {
            Arrays.fill(vis,false);
            max[0] = 0;
            dfs(vis,i,list,max);
            ans = Math.max(ans,max[0]);
        
        }

        return ans;

    }


    public static void dfs(boolean vis[], int i, ArrayList<ArrayList<Integer>> list, int[] max)
    {
        vis[i] = true;
        max[0]++;
        for(int ind = 0 ; ind < list.get(i).size() ; ind++)
        {
            int ni = list.get(i).get(ind);
            if(!vis[ni])
            {
                dfs(vis,ni,list,max);
            }
        }
    }
}
