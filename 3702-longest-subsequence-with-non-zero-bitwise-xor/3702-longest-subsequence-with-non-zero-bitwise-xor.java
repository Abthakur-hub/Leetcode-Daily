class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        long sum = 0;
        boolean nonZero = false;

        for (int i = 0; i < n; i++) {
            sum ^= nums[i];

            if (nums[i] != 0) {
                nonZero = true;
            }
        }

        if (sum != 0) {
            return n;
        }

        if (nonZero) {
            return n - 1;
        }

        return 0;
    }
}