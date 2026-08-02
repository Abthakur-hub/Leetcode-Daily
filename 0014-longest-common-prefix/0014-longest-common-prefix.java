class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String s1  = strs[strs.length-1];
        int i=0;
        StringBuilder sb = new StringBuilder();
        sb.append("");

        while(i<s.length() && i<s1.length()){
            if(s.charAt(i)==s1.charAt(i)){
                sb.append(s.charAt(i));
                i++;
            }
            else break;
        }  
        return sb.toString();     
    }
}