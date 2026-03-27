class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        recur(list,s,"",0);
        return list;
    }
    public static void recur(List<String> list, String s, String ans, int index)
    {
        if(index == s.length())
        {
            list.add(ans);
            return;
        }

        char ch = s.charAt(index); 

        if(!Character.isDigit(ch))
        {
            recur(list,s,ans+Character.toUpperCase(ch),index+1);
            recur(list,s,ans+Character.toLowerCase(ch),index+1);
        }
        else
        {
            ans += ch;
            recur(list,s,ans,index+1);
        }

    }
}