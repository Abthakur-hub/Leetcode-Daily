class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int a : nums){
            list.add(a);
        }
        int i=1;
        while(true){
            if(!list.contains(k*i)) return k*i;
            i++;
        }
    }
}