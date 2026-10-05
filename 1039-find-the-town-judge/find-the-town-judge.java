class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n == 1)
        {
            return 1;
        }
        List<List<Integer>> list = new ArrayList<>();
        int indegree[] = new int[n+1];
        for(int i = 0 ; i < n+1 ; i++)
        {
            list.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < trust.length ; i++)
        {
            list.get(trust[i][0]).add(trust[i][1]);
            indegree[trust[i][1]]++;
        }

        for(int i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i).size() == 0 && indegree[i] == n-1)
            {
                return i;
            }        
        }

        return -1;


    }
}