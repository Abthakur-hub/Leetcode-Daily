class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i< num; i++) {
            if (num % i == 0){
                if (i != num / i) {
                    sum+=i;
                }
            }
        }
        boolean flag = true;
        if(sum==num) flag = true;
        else flag = false;
        return flag == true?true:false;  
    }
}