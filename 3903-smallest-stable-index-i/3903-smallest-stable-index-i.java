class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int b = max(i,nums) - min(i, nums);
            if(b<=k){
                return i;
            }
        }
        return -1;
    }
    public static int max(int a , int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<=a; i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int a , int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i=a; i<arr.length; i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
}