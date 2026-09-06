class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("D")){
                int a = st.peek();
                st.add(a*2);
            }
            else if(s.equals("C")) st.pop();
            else if(s.equals("+")){
                int b = st.pop();
                int c = st.peek();
                st.add(b);
                st.add(b+c);
            }
            else{
                int d = Integer.parseInt(s);
                st.add(d);
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum+=st.pop(); 
        }
        return sum ;
    }
}