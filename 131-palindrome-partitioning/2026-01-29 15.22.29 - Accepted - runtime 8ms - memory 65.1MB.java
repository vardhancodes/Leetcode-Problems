class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> sublist = new ArrayList<>();
        recur(list,sublist,0,s);
        return list;
    }
    public static void recur(List<List<String>> list,  List<String> sublist, int index, String s )
    {
        if(index == s.length()  )
        {
            list.add(new ArrayList<>(sublist));
        }

        for(int i = index ; i < s.length() ; i++)
        {
            if(isPalindrome(s,index,i))
            {
                sublist.add(s.substring(index,i+1));
                recur(list,sublist,i+1,s);
                sublist.remove(sublist.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s , int start , int end)
    {
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}