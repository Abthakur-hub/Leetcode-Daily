class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while(n>0){
            int a = n%10;
            if(max2<=a){
                
                if(max<=a){
                    max2=max;
                    max = a;
                }
                else max2 = a;
            }
            n/=10;
        }
        return max*max2;
    }
}