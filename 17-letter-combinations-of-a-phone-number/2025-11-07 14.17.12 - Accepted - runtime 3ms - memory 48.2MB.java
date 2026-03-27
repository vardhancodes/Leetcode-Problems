class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        String ans = "";
        recur(list,map,0,ans,digits);
        return list;
    }
    public static void recur(List<String> list, HashMap<String,String> map, int ind, String ans, String digits)
    {
        if(ans.length() == digits.length())
        {
            list.add(ans);
            return;
        }
        String s1 = map.get(String.valueOf(digits.charAt(ind)));
        for(int i = 0 ; i < s1.length() ; i++)
        {
            recur(list,map,ind+1,ans+s1.charAt(i),digits);
        }
    }
}