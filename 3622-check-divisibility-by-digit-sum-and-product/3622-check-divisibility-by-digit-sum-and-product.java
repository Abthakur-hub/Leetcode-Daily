class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long product = 1;
        int num = n;
        while(n>0){
            int a = n%10;
            sum+=a;
            product*=a;
            n/=10;
        }
        long b = sum + product;
        return num%b==0;
    }
}