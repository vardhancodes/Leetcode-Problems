class Solution {
    public long maximumImportance(int n, int[][] roads) {
        Pair degree[] = new Pair[n];
        int value[] = new int[n];
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            list.add(new ArrayList<>());
            degree[i] = new Pair(i,0);
        }
        for(int i = 0 ; i < roads.length ; i++)
        {
            list.get(roads[i][0]).add(roads[i][1]);
            degree[roads[i][0]].val++;
            degree[roads[i][1]].val++;  
            
        }

        Arrays.sort(degree, (a,b) -> b.val - a.val);
        for(int i = 0 ; i < degree.length ; i++)
        {
            value[degree[i].ind] = n;
            n -= 1;
        }
        long sum = 0;
        for(int i = 0 ; i < value.length ; i++)
        {
            long subsum = 0;
            for(int j = 0 ; j < list.get(i).size() ; j++)
            {
                subsum += value[i] + value[list.get(i).get(j)];
            }
            sum += subsum;
        }

        return sum;


    }
}

class Pair{
    int ind;
    int val;

    Pair(int ind , int val)
    {
        this.ind = ind;
        this.val = val;
    }
}