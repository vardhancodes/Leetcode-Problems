class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<String>();
        list.add(words[0]);
        for(int i = 1 ; i < words.length ; i++)
        {
            if(!isAnagram(words[i],words[i-1]))
            {
                list.add(words[i]);
            }
        }

        return list;
    }

    public static boolean isAnagram(String s, String s1)
    {
        if(s.length() != s1.length())
        {
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[s1.charAt(i)-'a']--;
        }

        for(int i = 0 ; i < freq.length ; i++)
        {
            if(freq[i] > 0)
            {
                return false;
            }
        }
        return true;
    }
}