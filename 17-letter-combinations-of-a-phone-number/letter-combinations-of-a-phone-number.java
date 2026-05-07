class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> list = new ArrayList<>();
        recur(digits,list,map,0,"");
        return list;
    }

    public static void recur(String digits, List<String> list, HashMap<Character,String> map, int ind, String s)
    {
        if(ind == digits.length())
        {
            list.add(s);
            return;
        }


        for(int i = 0 ; i < map.get(digits.charAt(ind)).length() ; i++)
        {
            recur(digits,list,map,ind+1,s+map.get(digits.charAt(ind)).charAt(i));
        }
    }
}