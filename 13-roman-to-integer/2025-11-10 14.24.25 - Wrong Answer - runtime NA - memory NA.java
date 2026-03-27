class Solution {
    public int romanToInt(String s) {
        // Create a map for Roman numeral values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int ans = 0;

        // Loop through the string, checking if subtraction is needed
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char nextchar = s.charAt(i + 1);
            
            // Keep the original condition for subtraction
            if ((ch == 'I' && (nextchar == 'V' || nextchar == 'X')) 
                || (ch == 'X' && (nextchar == 'L' || nextchar == 'C')) 
                || (ch == 'C' && (nextchar == 'D' || nextchar == 'M'))) {
                
                ans += map.get(nextchar) - map.get(ch);
                i++;  // Increment i here because we are skipping the next character
            } else {
                ans += map.get(ch);
            }
        }

        // Add the value of the last character
        ans += map.get(s.charAt(s.length() - 1));

        return ans;
    }
}
