class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[] = new boolean[rooms.size()];
        
        dfs(vis,rooms,0);

        for(int i = 0 ; i < vis.length ; i++)
        {
            if(!vis[i])
            {
                return false;
            }
        }
        return true;
    }

    public void dfs(boolean []vis, List<List<Integer>> rooms, int i)
    {
        vis[i] = true;

        for(int ind = 0 ; ind < rooms.get(i).size() ; ind++)
        {
            int ni = rooms.get(i).get(ind);
            if(!vis[ni])
            {
                dfs(vis,rooms,ni);
            }
        }
    }
}