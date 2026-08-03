class Solution {
    int[] memo;
    int[] stoneValue;
    int n;

    public String stoneGameIII(int[] stoneValue) {
        this.stoneValue = stoneValue;
        n = stoneValue.length;
        memo = new int[n];
        Arrays.fill(memo, Integer.MIN_VALUE);

        int diff = solve(0);

        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }

    private int solve(int i) {
        if (i >= n) return 0;

        if (memo[i] != Integer.MIN_VALUE)
            return memo[i];

        int take = 0;
        int best = Integer.MIN_VALUE;

        for (int k = 0; k < 3 && i + k < n; k++) {
            take += stoneValue[i + k];
            best = Math.max(best, take - solve(i + k + 1));
        }

        return memo[i] = best;
    }
}