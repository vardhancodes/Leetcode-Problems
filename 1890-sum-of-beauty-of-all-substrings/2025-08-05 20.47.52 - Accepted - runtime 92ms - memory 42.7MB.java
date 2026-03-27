class Solution {
    public int beautySum(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];

            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 97] += 1;

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (arr[k] > 0) {
                        if (arr[k] > max) max = arr[k];
                        if (arr[k] < min) min = arr[k];
                    }
                }

                ans += (max - min);
            }
        }

        return ans;
    }
}
