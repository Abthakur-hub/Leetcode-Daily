class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(sum(nums[i])==i) return i;
        }
        return -1;
    }
    public static int sum(int a){
        int s = 0;
        while(a>0){
            int b = a%10;
            s+=b;
            a/=10;
        }
        return s;
    }
}