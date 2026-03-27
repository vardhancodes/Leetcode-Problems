class Solution {
    public String getHint(String secret, String guess) {
        String ans = "";
        int bulls = 0;
        int cows = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < secret.length() ; i++)
        {
            map.put(secret.charAt(i),map.getOrDefault(secret.charAt(i),0)+1);
        }
        for(int i = 0; i < secret.length(); i++)
        {
            char ch1 = guess.charAt(i);
            char ch2 = secret.charAt(i);
            if(ch1 == ch2)
            {
                bulls++;
                map.put(ch1,map.getOrDefault(ch1,0)-1);
            }
            else
            {
                if(map.containsKey(ch1) && map.get(ch1) > 0)
                {
                    map.put(ch1,map.getOrDefault(ch1,0)-1);
                    cows++;
                    if(map.get(ch1) == 0)
                    {
                        map.remove(ch1);
                    }
                }
            }

        }
        ans = Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
        return ans;
        
    }
}