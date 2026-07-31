class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[(int)(ch-'a')]++;
        }
        Arrays.sort(freq);
        int n = freq.length;
        
        int a=0;
        int b=n-1;
        if(n>2){
            while(a<b){
                int temp = freq[a];
                freq[a]=freq[b];
                freq[b]=temp;
                a++;
                b--;
        }
        }
        
        int count = 0;
        int i=1;
        int j=0;
        while(i<=4){
            for(int k=0; k<8; k++){
                if(j<n && freq[j]>0){
                    count+=freq[j]*i;
                    j++;
                }
            }
            i++;
        }
        return count;
    }
}