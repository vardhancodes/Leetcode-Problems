import java.util.*;

class Solution {
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long ans[] = new long[n - k + 1];
        int index = 0;
        for (int j = 0; j <= n - k; j++) {
            solve(nums, j, k, x, ans, index);
            index++;
        }
        return ans;
    }

    public static void solve(int[] nums, int j, int k, int x, long ans[], int index) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = j; i < j + k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> freqlist = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            freqlist.add(new int[]{key, freq});
        }

        Collections.sort(freqlist, (a, b) -> {
            if (a[1] != b[1])
                return b[1] - a[1];
            return b[0] - a[0];
        });

        long sum = 0;
        for (int i = 0; i < x && i < freqlist.size(); i++) {
            long key = freqlist.get(i)[0];
            long freq = freqlist.get(i)[1];
            sum += key * freq;
        }

        ans[index] = sum;
    }
}