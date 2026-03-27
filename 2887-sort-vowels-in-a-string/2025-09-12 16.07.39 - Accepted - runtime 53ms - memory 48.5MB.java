class Solution {
    public String sortVowels(String s) {
        StringBuilder ans = new StringBuilder();
        ArrayList<Character>list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' )
            {
                list.add(ch);
            }
        }
        Collections.sort(list);
        int counter = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' )
            {
                ans.append(list.get(counter));
                counter++;
            }
            else
            {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}