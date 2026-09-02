class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for( char ch : s.toCharArray()){
            if(ch!='*')st.push(ch);
            else st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}