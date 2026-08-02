class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int i = n - 1;

        while(i>=0 && nums[i] >= nums[i + 1]){
            i--;
        }
        int j = n;
        if(i >= 0){
            while(nums[i] >= nums[j]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, i + 1, n);
    }
    public void reverse(int[] arr, int left, int right) {
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}