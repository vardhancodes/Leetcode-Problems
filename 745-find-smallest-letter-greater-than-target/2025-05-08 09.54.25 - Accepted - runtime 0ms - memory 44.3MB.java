class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        char ans = '1' ;
        
        while(start <= end)
        {
            int mid = (start + (end - start)/2);
            if(target >= letters[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
                ans = letters[mid];
                
            }

        }
        if(ans == '1')
        {
            return letters[0];
        }
        else
        {
            return ans;
        }
    }
    
}