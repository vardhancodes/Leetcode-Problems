class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < queries.length ; i++)
        {
            boolean found = false;
            for(int j = 0 ; j < dictionary.length ; j++)
            {
                int edits = 0;
                for(int index = 0 ; index < dictionary[j].length() ; index++)
                {
                    if(queries[i].charAt(index) != dictionary[j].charAt(index))
                    {
                        edits++;
                    }
                }
                if(edits <= 2)
                {
                    found = true;
                    ans.add(queries[i]);
                }
                if(found)
                {
                    break;
                }
            }
        }

        return ans;
    }
}