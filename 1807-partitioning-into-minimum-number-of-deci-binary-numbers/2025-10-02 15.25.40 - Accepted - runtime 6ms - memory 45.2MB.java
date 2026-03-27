class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        int count = 0;
        for(int i = n.length()-1 ; i >= 0 ; i--)
        {
            int num = (int)(n.charAt(i)-'0');
            count = num/1;
            ans = Math.max(count,ans);

        }
        return ans;
        
    }
}