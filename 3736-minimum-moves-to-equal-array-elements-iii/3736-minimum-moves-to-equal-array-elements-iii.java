class Solution {
    public int minMoves(int[] nums) {
        int high = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=high) high = nums[i];
        }
        int moves = 0;
        for(int i=0; i<nums.length; i++){
            moves+=high-nums[i];
        }
        return moves;
    }
}