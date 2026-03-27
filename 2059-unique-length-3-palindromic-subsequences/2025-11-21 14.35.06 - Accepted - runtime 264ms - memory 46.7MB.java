class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> first = new HashMap<>();
        // storing occurrence
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(!first.containsKey(ch))
            {
                first.put(ch,i);
            }
        }
        HashMap<Character,Integer> last = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            last.put(ch,i);
        }
        int ans = 0;
        for(Map.Entry<Character,Integer> entry : first.entrySet())
        {
            char ch = entry.getKey();
            int val = entry.getValue();
            if((last.get(ch)-val) > 0)
            {
                HashSet<Character> set = new HashSet<>();
                for(int i = val+1 ; i < last.get(ch) ; i++)
                {
                    char chart = s.charAt(i);
                    if(!set.contains(chart))
                    {
                        set.add(chart);
                    }
                }
                ans+=set.size();

            }
        }
        return ans;
    }
}