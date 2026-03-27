class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new  ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length ; i++)
        {
            if(end >= intervals[i][0])
            {
                end = Math.max(end,intervals[i][1]);
            }
            else
            {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(start);
                sublist.add(end);
                list.add(sublist);
                start = intervals[i][0];
                end = intervals[i][1];

            }
        }
        List<Integer> sublist = new ArrayList<>();
        sublist.add(start);
        sublist.add(end);
        list.add(sublist);
        int ans[][] = new int[list.size()][2];
        for(int i = 0 ; i < list.size() ; i++)
        {
            for(int j = 0 ; j < list.get(i).size() ; j++)
            {
                ans[i][j] = list.get(i).get(j);
            }
        }

        return ans;
    }
}