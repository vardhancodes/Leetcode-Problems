class Solution {
    public int maxVowels(String s, int k) {
        int size = s.length();
        int index = 0;
        int count = 0;

        while(index < k && index < size)
        {
            if(isVowel(s.charAt(index)))
            {
                count+=1;
            }
            index++;
        }
        int maxCount = count;

        for(int i = 1 ; i <= size-k ; i++)
        {
            if(isVowel(s.charAt(i-1))) 
            {
                count -= 1; 
            }
            if(isVowel(s.charAt(i+k-1)))
            {
                count+=1;
            }
            if(count == k)
            {
                return count;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
    
    public boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u')
        {
            return true;
        }
        return false;

    }
}