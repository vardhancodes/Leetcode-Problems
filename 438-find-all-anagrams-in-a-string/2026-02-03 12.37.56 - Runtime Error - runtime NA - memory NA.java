class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int []freqp = new int[26];
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < p.length() ; i++)
        {
            freqp[p.charAt(i) - 'a']++;
        }
        int freqs[] = new int[26];
        for(int i = 0 ; i < p.length() ; i++)
        {
            freqs[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freqs,freqp))
        {
            list.add(0);
        }
        for(int i = 1 ; i <= s.length()-p.length() ; i++)
        {
            freqs[s.charAt(i-1) - 'a']--;
            freqs[s.charAt(i+p.length()-1) - 'a']++;

            if(Arrays.equals(freqs,freqp))
            {
                list.add(i);
            }
        }

        return list;
    }
}