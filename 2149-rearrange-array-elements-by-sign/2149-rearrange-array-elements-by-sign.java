class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int a = 0;
        int b = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0) {
                neg[a]=nums[i];
                a++;
            }
            else {
                pos[b]=nums[i];
                b++;
            }
        }
        int[] res = new int[nums.length];
        int i=0;
        int j=0;
        while(i<nums.length/2){
            res[j]=pos[i];
            j++;
            res[j]=neg[i];
            i++;
            j++;
        }
        return res;
    }
}