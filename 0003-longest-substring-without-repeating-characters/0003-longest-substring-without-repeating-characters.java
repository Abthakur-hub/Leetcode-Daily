class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        List<Character> list = new ArrayList<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while(j<s.length()){
            if(!list.contains(s.charAt(j))){
                list.add(s.charAt(j));
                j++;
                max = Math.max(max, list.size());
            } 
            else{
                list.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }

        return max;
    }
}