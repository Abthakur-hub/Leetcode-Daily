import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, d);
            total += d;
        }

        long k = (long) k1 + k2;

        if (k >= total) return 0;

        long[] freq = new long[max + 1];

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            freq[d]++;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            if (freq[d] == 0) continue;

            long move = Math.min(freq[d], k);

            freq[d] -= move;
            freq[d - 1] += move;

            k -= move;

            if (freq[d] > 0) {
                d++;
            }
        }

        long ans = 0;

        for (int d = 1; d <= max; d++) {
            ans += freq[d] * d * d;
        }

        return ans;
    }
}