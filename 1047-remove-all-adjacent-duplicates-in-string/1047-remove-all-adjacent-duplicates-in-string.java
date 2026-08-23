class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(st.size()==0) st.add(ch);
            else{
                if(ch == st.peek()){
                    st.pop();
                }
                else{
                    st.add(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}