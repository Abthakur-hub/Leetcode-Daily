class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] exactPairs = new long[max + 1];

        for (int g = max; g >= 1; g--) {
            long cnt = 0;
            for (int multiple = g; multiple <= max; multiple += g) {
                cnt += freq[multiple];
            }

            long pairs = cnt * (cnt - 1) / 2;

            for (int multiple = g * 2; multiple <= max; multiple += g) {
                pairs -= exactPairs[multiple];
            }

            exactPairs[g] = pairs;
        }

        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exactPairs[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long target = queries[i] + 1; 
            int l = 1, r = max;

            while (l < r) {
                int mid = l + (r - l) / 2;
                if (prefix[mid] >= target)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}