class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n == 1)
        {
            return 1;
        }
        int outdegree[] = new int[n+1];
        int indegree[] = new int[n+1];
      
        for(int i = 0 ; i < trust.length ; i++)
        {
            outdegree[trust[i][0]]++;
            indegree[trust[i][1]]++;
        }

        for(int i = 1 ; i < n+1 ; i++)
        {
            if( outdegree[i] == 0 && indegree[i] == n-1)
            {
                return i;
            }        
        }

        return -1;


    }
}