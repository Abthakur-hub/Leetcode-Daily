class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a = sum(x);
        if(x%a==0) return a;
        else return -1;
    }
    public int sum(int a){
        int sum = 0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}