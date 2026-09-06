class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int j = 0;
            while(nums2[j]!=nums1[i]) j++;
            for( int a = j ; a<nums2.length; a++){
                if(nums2[a]>nums1[i]){
                    arr[i]=nums2[a];
                    break;
                }
                else if(a==nums2.length-1){
                    arr[i]=-1;
                }
                else{}
            }
        }
        return arr;
    }
}