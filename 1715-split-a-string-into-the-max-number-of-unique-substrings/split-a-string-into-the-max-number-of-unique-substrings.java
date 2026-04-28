class Solution {
    public int maxUniqueSplit(String s) {
        int ans[] = new int[1];
        HashSet<String> set = new HashSet<>();
        recur(0,s,ans,set,0);
        return ans[0];

    }

    public static void recur(int ind, String s, int[] ans, HashSet<String> set, int max)
    {
        if(ind == s.length())
        {
            ans[0] = Math.max(ans[0],max);
            return;
        }

        for(int i = ind ; i < s.length() ; i++)
        {
            if(!set.contains(s.substring(ind,i+1)))
            {
                set.add(s.substring(ind,i+1));
                max++;
                recur(i+1,s,ans,set,max);
                max--;
                set.remove(s.substring(ind,i+1));
            }
        }
    }
}