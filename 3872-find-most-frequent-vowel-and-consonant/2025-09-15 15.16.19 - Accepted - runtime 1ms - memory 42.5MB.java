class Solution {
    public int maxFreqSum(String s) {
        int freqvowel[] = new int[26];
        int freqconsonant[] = new int[26];

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                freqvowel[ch-'a']++;
            }
            else
            {
                freqconsonant[ch-'a']++;
            }
        }
        int maxV = 0;
        int maxC = 0;

        for(int i = 0 ; i < freqvowel.length ; i++)
        {
            if(maxV < freqvowel[i])
            {
                maxV = freqvowel[i];
            }
            if(maxC < freqconsonant[i])
            {
                maxC = freqconsonant[i];
            }

        }

        return maxC+maxV;


    }
}