class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) max = Math.max(max,nums[i]);

        for(int i=nums.length-1; i>=0; i--){
            while(st.size()!=0 && nums[i]>=st.peek()) st.pop();
            if(st.size()==0){
                if(nums[i]==max) arr[i]=-1;
                else{
                    for(int j=0; j<nums.length; j++){
                        if(nums[i]<nums[j]){
                            arr[i]=nums[j];
                            break;
                        }
                    }
                }
            }
            else{
                arr[i]=st.peek();
            }

            st.push(nums[i]);
        }
        return arr;
    }
}