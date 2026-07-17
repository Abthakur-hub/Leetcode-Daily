class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        while(r<nums.length){
            if(nums[l]!=nums[r]){
                l++;
                int temp = nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
            }
            r++;
        }
        return l+1;
    }
}