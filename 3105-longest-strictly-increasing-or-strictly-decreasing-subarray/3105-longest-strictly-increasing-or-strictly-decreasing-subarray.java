class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int max1 = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1])inc++;
            else inc = 1;
            max1 = Math.max(inc , max1);
        }
        int dec = 1;
        int max2 = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1])dec++;
            else dec = 1;
            max2 = Math.max(dec , max2);
        }
        return Math.max(max1 , max2);
    }
}