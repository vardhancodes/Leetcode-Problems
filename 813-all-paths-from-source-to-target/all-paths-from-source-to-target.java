class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        boolean vis[] = new boolean[graph.length];

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        dfs(ans,graph,vis,sublist,0,graph.length-1); 

        return ans;
    }

    public void dfs(List<List<Integer>> ans, int[][] graph, boolean vis[], List<Integer> sublist, int i, int end)
    {
        sublist.add(i);
        if(i == end)
        {
            ans.add(new ArrayList<>(sublist));
            sublist.remove(sublist.size()-1);
            return;
        }
        

        for(int ind = 0 ; ind < graph[i].length ; ind++)
        {
            int ni = graph[i][ind];
            dfs(ans,graph,vis,sublist,ni,end);
        }

        sublist.remove(sublist.size()-1);

        
    }


}