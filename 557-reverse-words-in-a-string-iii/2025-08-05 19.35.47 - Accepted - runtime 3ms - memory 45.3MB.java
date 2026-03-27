class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();

        int startIndex = 0 ;
        int endIndex = 0 ; 
        for(endIndex = 0 ; endIndex <= arr.length ; endIndex++)
        {
            if(endIndex == arr.length || arr[endIndex] == ' ')
            {
                reverse(arr,startIndex,endIndex-1);
                startIndex = endIndex+1;
            }

        }

        return new String(arr);

    }

    public static void reverse(char[] arr, int startIndex, int endIndex)
    {
       while(startIndex < endIndex)
       {
        char temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
        startIndex++;
        endIndex--;

        }
    }
}