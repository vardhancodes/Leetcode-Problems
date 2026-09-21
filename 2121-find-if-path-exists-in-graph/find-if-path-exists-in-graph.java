class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            list.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < edges.length ; i++)
        {
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] vis = new boolean[n];
        dfs(vis,list,source);

        if(vis[destination])
        {
            return true;
        }

        return false;
    }

    public void dfs(boolean[] vis, ArrayList<ArrayList<Integer>> list, int i)
    {
        vis[i] = true;

        for(int ind = 0 ; ind < list.get(i).size() ; ind++)
        {
            int ni = list.get(i).get(ind);
            if(!vis[ni])
            {
                dfs(vis,list,ni);
            }
        }
    }
}