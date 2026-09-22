class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sublist.add(0);
        dfs(ans,graph,sublist,0,graph.length-1); 

        return ans;
    }

    public void dfs(List<List<Integer>> ans, int[][] graph,List<Integer> sublist, int i, int end)
    {
        if(i == end)
        {
            ans.add(new ArrayList<>(sublist));
            return;
        }
        

        for(int ind = 0 ; ind < graph[i].length ; ind++)
        {
            int ni = graph[i][ind];
            sublist.add(ni);
            dfs(ans,graph,sublist,ni,end);
            sublist.remove(sublist.size()-1);
        }


        
    }


}