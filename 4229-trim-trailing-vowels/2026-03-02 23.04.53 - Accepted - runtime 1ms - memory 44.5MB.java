class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int index = str.length()-1;
        while(index >= 0)
        {
            char ch = str.charAt(index);
            if(ch == 'a' || ch == 'u' || ch == 'o' || ch == 'i' || ch == 'e')
            {
                str.deleteCharAt(index);
            }
            else
            {
                break;
            }
            index--;
        }

        return str.toString();
    }
}