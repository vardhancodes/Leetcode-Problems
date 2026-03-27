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

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            ans += Character.toUpperCase(ch);
            recur(list,s,ans,index+1);
            ans = ans.substring(0,ans.length()-1);
            ans += Character.toLowerCase(ch);
            recur(list,s,ans,index+1);
        }
        else
        {
            ans += ch;
            recur(list,s,ans,index+1);
        }

    }
}