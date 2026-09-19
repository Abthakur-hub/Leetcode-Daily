class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int zerocount = 0;
        int max = Integer.MIN_VALUE;

        for(int j=0; j<nums.length; j++){
            if(nums[j]==0){ //pehle expand kro window 
                zerocount++;
            }

            while(zerocount>k){ // phir shrink kro jaba tak zerocount k ke equal na ho jaye
                if(nums[i]==0)zerocount--;
                i++;
            }
            max = Math.max(max,j-i+1); // har point pe check kro length
            
        }
        return max;
    }
}