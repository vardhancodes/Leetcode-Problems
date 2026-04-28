class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        recur(n,list,"",0,0);
        return list;
    }
    public void recur(int n , List<String> list , String s ,int open , int close )
    {
        if(open < close)
        {
            return;
        }

        if(s.length() == n*2)
        {
            if(open == close)
            {
                list.add(s);
            }
            return;
        }

        recur(n,list,s+"(",open+1,close);
        recur(n,list,s+")",open,close+1);

    }

    
}