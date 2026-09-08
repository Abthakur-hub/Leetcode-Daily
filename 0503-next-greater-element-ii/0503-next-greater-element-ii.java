class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){
            st.push(nums[i]);
        }
        int[] arr = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--){
            while(st.size()!=0 && nums[i]>=st.peek()) st.pop();
            if(st.size()==0){
                arr[i]=-1;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return arr;
    }
}