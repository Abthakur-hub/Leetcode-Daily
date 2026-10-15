class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<nums.size(); i++){
            set.add(nums.get(i));
            count+=Math.pow(set.size(),2);

            for(int j=i+1; j<nums.size(); j++){
                set.add(nums.get(j));
                count+=Math.pow(set.size(),2);
            }
            set.clear();
        }
        return count;
    }
}