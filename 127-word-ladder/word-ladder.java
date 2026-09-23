class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i < wordList.size() ; i++)
        {
            set.add(wordList.get(i));
        }
        StringBuilder sb = new StringBuilder(beginWord);
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(sb,1));

        while(!q.isEmpty())
        {
            Pair p = q.poll();
            StringBuilder w = new StringBuilder(p.word);
            int l = p.len;
            if(w.toString().equals(endWord))
            {
                return l;
            }
        
            for(int i = 0 ; i < beginWord.length() ; i++)
            {
                for(int j = 0 ; j < 26 ; j++)
                {
                    char c = (char)('a'+ j);
                    w.setCharAt(i,c);
                    
                    if(set.contains(w.toString()))
                    {
                        q.add(new Pair(new StringBuilder(w),l+1));
                        set.remove(w.toString());
                        
                    }
                }
                w.setCharAt(i, p.word.charAt(i));

            
            }

        } 

        return 0;
    }
}
class Pair{
    StringBuilder word;
    int len;

    Pair(StringBuilder word, int len)
    {
        this.word = word;
        this.len = len;
    }
}