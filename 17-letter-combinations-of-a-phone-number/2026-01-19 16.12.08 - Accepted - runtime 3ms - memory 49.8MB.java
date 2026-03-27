class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        recur(digits,map,list,0,"");
        return list;
    }
    public static void recur(String digits , HashMap<Character,String> map, List<String> list, int index, String ans)
    {
        if(ans.length() == digits.length())
        {
            list.add(ans);
            return;
        }


        for(int i = 0 ; i < map.get(digits.charAt(index)).length() ; i++)
        {
            recur(digits,map,list,index+1,ans+map.get(digits.charAt(index)).charAt(i));
        }
    } 
}