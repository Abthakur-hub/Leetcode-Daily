class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i=0; i<10; i++){
            int a = product(n+i);
            if(a%t==0){
                ans = n+i;
                break;
            }
        }
        return ans;
    }
    public static int product(int b){
        int p = 1;
        while(b>0){
            p*=b%10;
            b/=10;
        }
        return p;
    }
}