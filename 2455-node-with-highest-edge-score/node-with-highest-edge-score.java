class Solution {
    public int edgeScore(int[] edges) {
        long score[] = new long[edges.length];
        for(int i = 0 ; i < edges.length ; i++)
        {
            score[edges[i]] += i;
        }
        long max = 0;
        int ind = Integer.MAX_VALUE;
        for(int i = edges.length-1 ; i>= 0 ; i--)
        {
            if(score[i] > max)
            {
                max = score[i];
                ind = i;
            }
            else if(score[i] == max)
            {
                ind = Math.min(i,ind);
            }
        }
        return ind;
       
      

        


    }
}