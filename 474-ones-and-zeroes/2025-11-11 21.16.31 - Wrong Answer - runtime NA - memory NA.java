class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int ans = 0;
        for(int i = 0 ; i < strs.length ; i++)
        {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = 0 ; j < strs[i].length() ; j++)
            {
                map.put(strs[i].charAt(j),map.getOrDefault(strs[i].charAt(j),0)+1);
            }
            int size = (m>n)?m:n;
            if(!map.isEmpty() && map.getOrDefault('0',0) <= m && map.getOrDefault('1',0) <= n && strs[i].length() <= size)
            {
                ans++;
            }
        }
        return ans;
    }
}