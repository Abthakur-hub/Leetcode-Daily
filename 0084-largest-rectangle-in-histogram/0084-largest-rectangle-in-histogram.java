class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[n];
        int[] nse = new int[n];

        pse[0]=-1;
        st.push(0);

        for(int i=1; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        st.clear();

        nse[n-1]=n;
        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max,heights[i]* (nse[i]-pse[i]-1));
        }
        return max;
    }
}