class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            int x = target.charAt(i) - 'a';

            if (freq[x] > 0) {
                freq[x]--;
                ans.append(target.charAt(i));
            } else {
                for (int c = x + 1; c < 26; c++) {
                    if (freq[c] > 0) {
                        ans.append((char) ('a' + c));
                        freq[c]--;

                        for (int j = 0; j < 26; j++) {
                            while (freq[j] > 0) {
                                ans.append((char) ('a' + j));
                                freq[j]--;
                            }
                        }

                        return ans.toString();
                    }
                }
                break;
            }
        }

        for (int i = ans.length() - 1; i >= 0; i--) {
            char ch = ans.charAt(i);
            freq[ch - 'a']++;

            int x = target.charAt(i) - 'a';

            for (int c = x + 1; c < 26; c++) {
                if (freq[c] > 0) {
                    StringBuilder res = new StringBuilder(ans.substring(0, i));
                    res.append((char) ('a' + c));
                    freq[c]--;

                    for (int j = 0; j < 26; j++) {
                        while (freq[j] > 0) {
                            res.append((char) ('a' + j));
                            freq[j]--;
                        }
                    }

                    return res.toString();
                }
            }
        }

        return "";
    }
}