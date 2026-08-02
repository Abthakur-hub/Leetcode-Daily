class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if(nums.length <= 2) return nums[nums.length-1];
        int count = 1;
        int i=nums.length-2;
        int ans = Integer.MAX_VALUE;
        while(i>=0){
            if(nums[i]!=nums[i+1]) count++;
            if(count==3) ans = nums[i];
            i--;
        }
        return ans==Integer.MAX_VALUE?nums[nums.length-1]:ans;
    }
}