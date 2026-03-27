class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []freqp = new int[26];
        if(s1.length() > s2.length())
        {
            return false;
        }
        for(int i = 0 ; i < s1.length() ; i++)
        {
            freqp[s1.charAt(i) - 'a']++;
        }
        int freqs[] = new int[26];
        for(int i = 0 ; i < s1.length() ; i++)
        {
            freqs[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freqs,freqp))
        {
            return true;
        }
        for(int i = 1 ; i <= s2.length()-s1.length() ; i++)
        {
            freqs[s2.charAt(i-1) - 'a']--;
            freqs[s2.charAt(i+s1.length()-1) - 'a']++;

            if(Arrays.equals(freqs,freqp))
            {
                return true;
            }
        }

        return false;

    }
}