class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0){
                sum+=i;
                if (i != num / i) {
                    sum+=num/i;
                }
            }
        }
        if(num == 1) return false;
        boolean flag = true;
        if(sum==num) flag = true;
        else flag = false;
        return flag == true?true:false;  
    }
}