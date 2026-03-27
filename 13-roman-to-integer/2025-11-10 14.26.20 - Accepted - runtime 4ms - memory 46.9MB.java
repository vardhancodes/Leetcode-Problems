class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        int index = 0;
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            char ch = s.charAt(i);
            char nextchar = s.charAt(i+1);
            if((ch == 'I' && (nextchar == 'V' || nextchar == 'X')) 
            || (ch == 'X' && (nextchar == 'L' || nextchar == 'C')) 
            || (ch == 'C' && (nextchar == 'D' || nextchar == 'M')))
            {
                ans+=map.get(nextchar)-map.get(ch);
                i++;
                index++;
            }
            else
            {
                ans+=map.get(ch);
            }
            index++;
        }
        
        return (index == s.length())?ans:ans+(map.get(s.charAt(s.length()-1)));


    }
}