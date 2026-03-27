class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
       Arrays.sort(intervals, (a,b) -> Integer.compare(a[1] , b[1]));
       List<Integer> list = new ArrayList<>();
       int ptr1 = -1;
       int ptr2 = -1;
       int ans = 0;
       int n = list.size();
       for(int i = 0 ; i < intervals.length ; i++)
       {
           if((ptr1 >= intervals[i][0] && ptr1 <= intervals[i][1]) && (ptr2 >= intervals[i][0] && ptr2 <= intervals[i][1]))
           {
                continue;
           }
           else if(ptr2 >= intervals[i][0])
           {
                ans+=1;
                ptr1 = ptr2-1;
                ptr2 = intervals[i][1];
           }
           else
           {
                ans+=2;
                ptr1 = intervals[i][1]-1;
                ptr2 = intervals[i][1];
           }
       }
       return ans;

    }
}