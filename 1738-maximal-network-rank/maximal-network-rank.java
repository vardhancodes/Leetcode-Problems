class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int outdegree[] =  new int[n];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i < roads.length ; i++)
        {
            outdegree[roads[i][0]]++;
            outdegree[roads[i][1]]++;
            list.get(roads[i][0]).add(roads[i][1]);
            list.get(roads[i][1]).add(roads[i][0]);
        }

        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                if(list.get(i).contains(j))
                {
                    ans = Math.max(ans,outdegree[i] + outdegree[j]-1);
                }
                else
                {
                    ans = Math.max(ans,outdegree[i] + outdegree[j]);
                }
                
            }
        }

        return ans;


    }
}