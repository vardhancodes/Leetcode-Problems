class Solution {
    public boolean isMonotonic(int[] nums) {

        int size = nums.length;

        if (size < 3) {
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < size; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
