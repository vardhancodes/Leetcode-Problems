class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int s2 = newInterval[0];
        int e2 = newInterval[1];
        int StartRange = Integer.MAX_VALUE;
        int EndRange = -1;
        List<int[]> list = new ArrayList<>();
        int i = 0 ;
        int n = intervals.length;
        //before merging
        while( i < n && intervals[i][1] < newInterval[0])
        {
            list.add(intervals[i]);
            i++;
        }
        //overlapping
        while(i<n && newInterval[1] >= intervals[i][0])
        {
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        while(i < n)
        {
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}