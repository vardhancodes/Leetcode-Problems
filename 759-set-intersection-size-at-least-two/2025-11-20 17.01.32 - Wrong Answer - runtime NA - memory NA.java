class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
       Arrays.sort(intervals, (a,b) -> Integer.compare(a[1] , b[1]));
       int ans = 0;
       HashSet<Integer> set = new HashSet<>();
       set.add(intervals[0][1]-1);
       set.add(intervals[0][1]);
       for(int i = 1 ; i < intervals.length ; i++)
       {
            int count = 0;
            for(int j = intervals[i][0] ; j <= intervals[i][1] ; j++)
            {
                if(count == 2)
                {
                    break;
                }
                if(set.contains(j))
                {
                    count++;
                    continue;
                }
            }
            if(count == 1)
            {
                set.add(intervals[i][1]);
            }
            else if(count == 0)
            {
                set.add(intervals[i][1]-1);
                set.add(intervals[i][1]);
            }
       }
       return set.size();
    }
}