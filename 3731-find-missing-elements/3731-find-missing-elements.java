class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];

        List<Integer> l = new ArrayList<>();
        while(a<=b){
            l.add(a);
            a++;
        }
        for(int i=0; i<nums.length; i++){
            l.remove(Integer.valueOf(nums[i]));
        }
        return l;
    }
}