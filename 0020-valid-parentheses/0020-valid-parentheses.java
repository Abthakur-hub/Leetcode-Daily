class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch =='{' || ch == '[') st.add(ch);
            else {
                if(!st.isEmpty() && verify(ch , st)) st.pop();
                else return false;
            }
        }
        return (st.size()==0 ? true: false);
    }
    public static boolean verify(Character ch, Stack<Character> st){
        if(ch==')' && st.peek()=='(' ) return true;
        if(ch==']' && st.peek()=='[' ) return true;
        if(ch=='}' && st.peek()=='{' ) return true;
        return false;

    }
}