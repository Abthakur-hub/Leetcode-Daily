class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048; 

        boolean[][] dp = new boolean[4][MAX];
        dp[0][0] = true;

        for (int v : nums) {
            boolean[][] next = new boolean[4][MAX];

            for (int c = 0; c <= 3; c++) {
                System.arraycopy(dp[c], 0, next[c], 0, MAX);
            }

            for (int c = 0; c <= 3; c++) {
                for (int x = 0; x < MAX; x++) {
                    if (!dp[c][x]) continue;

                    for (int t = 1; c + t <= 3; t++) {
                        int contribution = (t % 2 == 1) ? v : 0;
                        next[c + t][x ^ contribution] = true;
                    }
                }
            }

            dp = next;
        }

        int ans = 0;
        for (boolean possible : dp[3]) {
            if (possible) ans++;
        }
        return ans;
    }
}