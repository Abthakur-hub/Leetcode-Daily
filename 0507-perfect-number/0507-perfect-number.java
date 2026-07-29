class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i< num; i++) {
            if (num % i == 0){
                if (i != num / i) {
                    list.add(i);
                }
            }
        }
        int sum = 0;
        Collections.sort(list);
        for(int a: list){
            sum+=a;
        }
        boolean flag = true;
        if(sum==num) flag = true;
        else flag = false;
        return flag == true?true:false;  
    }
}