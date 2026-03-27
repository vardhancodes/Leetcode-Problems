class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> first = new HashMap<>();
        HashMap<Character,Integer> last = new HashMap<>();
        // storing occurrence
        for(int i = 0 ; i < s.length() ; i++)
        {
            last.put(s.charAt(i),i);
            if(!first.containsKey(s.charAt(i)))
            {
                first.put(s.charAt(i),i);
            }
        }
        int ans = 0;
        for(Map.Entry<Character,Integer> entry : first.entrySet())
        {
            char ch = entry.getKey();
            int val = entry.getValue()+1;
            HashSet<Character> set = new HashSet<>();
            while(val <= last.get(ch)-1)
            {
                set.add(s.charAt(val));
                val++;
            }
            ans+=set.size();            
        }
        return ans;
    }
}