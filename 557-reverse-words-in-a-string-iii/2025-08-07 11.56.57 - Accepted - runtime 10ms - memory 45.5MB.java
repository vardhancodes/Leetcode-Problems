class Solution {
    public String reverseWords(String s) {
    StringBuilder str = new StringBuilder(s);

    int startIndex = 0;

    for(int endIndex = 0 ; endIndex <= str.length(); endIndex++)
    {
        if(endIndex == str.length()  || str.charAt(endIndex) == ' ')
        {
            rev2(str , startIndex , endIndex-1);
            startIndex = endIndex+1;
        }
    }

    return new String(str);


}

public static void rev2(StringBuilder str , int startIndex , int endIndex)
{
    while(startIndex < endIndex)
    {
        char first = str.charAt(startIndex);
        char last = str.charAt(endIndex);
        str.setCharAt(startIndex, last);
        str.setCharAt(endIndex, first);
        startIndex++;
        endIndex--;

    }
}
}