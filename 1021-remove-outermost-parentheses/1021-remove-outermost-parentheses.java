class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        int open = 0;
        int closed = 0;
        int j = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(')open++;
            else closed++;
            if(open==closed){
                sb.append(s.substring(j+1,i));
                j=i+1;
                open=0;
                closed=0;
            }
        }
        return sb.toString();
    }
}