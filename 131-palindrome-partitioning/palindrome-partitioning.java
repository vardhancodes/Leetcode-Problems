class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> sublist = new ArrayList<String>();
        recur(s,0,sublist,list);
        return list;
    }
    public static void recur(String s, int ind, List<String> sublist, List<List<String>> list)
    {
        if(ind == s.length())
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = ind ; i < s.length() ; i++)
        {
            if(isPalindrome(s,ind,i))
            {
                sublist.add(s.substring(ind,i+1));
                recur(s,i+1,sublist,list);
                sublist.remove(sublist.size()-1);
            }
        }

    }
    public static boolean isPalindrome(String s,int ind,int i)
    {
        while(ind < i)
        {
            if(s.charAt(ind) != s.charAt(i))
            {
                return false;
            }
            ind++;
            i--;
        }
        return true;
    }
}