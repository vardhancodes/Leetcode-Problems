class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('O');
        set.add('o');
        set.add('U');
        set.add('u');

       

        while(start <= end)
        {
            char chSt = sb.charAt(start);
            char chEn = sb.charAt(end);

            if(set.contains(chSt) && set.contains(chEn))
            {
                swap(start,end,sb);
                start++;
                end--;
            }
            else if(!set.contains(chSt))
            {
                start++;
            }

            else
            {
                end--;
            }

        }

         return sb.toString();
    }

    public static void swap(int start, int end , StringBuilder sb)
    {
        char temp = sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,temp);
    }
}