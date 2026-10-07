class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        boolean []vis = new boolean[n];
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i < edges.length; i++)
        {
            list.get(edges[i][1]).add(edges[i][0]);
        }

        for(int i = 0 ; i < n ; i++)
        {
            Arrays.fill(vis,false);
            List<Integer> sublist = new ArrayList<>();
            dfs(i,list,vis,sublist);
            Collections.sort(sublist);
            ans.add(sublist);
        }

        return ans;

    }

    public static void dfs(int i, List<List<Integer>> list, boolean []vis, List<Integer> sublist)
    {
        vis[i] = true;

        for(int ind = 0; ind < list.get(i).size() ; ind++)
        {
            int ni = list.get(i).get(ind);
            if(!vis[ni])
            {
                sublist.add(ni);
                dfs(ni,list,vis,sublist);
            }

        }
    }
}