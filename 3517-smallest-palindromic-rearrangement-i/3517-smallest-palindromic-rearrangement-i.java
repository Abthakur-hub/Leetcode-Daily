class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder sb1 = new StringBuilder();
        char b = 0;
        for(int i=0; i<26; i++){
            for(int j=0; j<freq[i]/2; j++){
                sb1.append((char) ('a' + i));
            }
            if(freq[i] % 2 == 1){
                b = (char) ('a' + i);
            }
        }
        StringBuilder ans = new StringBuilder(sb1);
        if(b != 0){
            ans.append(b);
        }
        ans.append(new StringBuilder(sb1).reverse());
        return ans.toString();
    }
}