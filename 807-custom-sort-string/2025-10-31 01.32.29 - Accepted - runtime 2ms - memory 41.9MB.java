class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0 ; i < order.length() ; i++)
        {
            char ch = order.charAt(i);
            if(map.containsKey(ch))
            {
                int count = map.get(ch);
                while(count!=0)
                {
                    ans.append(ch);
                    count--;
                }
                map.remove(ch);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            int count = entry.getValue();
            char ch = entry.getKey();
            while(count!=0)
            {
                ans.append(ch);
                count--;
            }
        }
        return ans.toString();
    }
}