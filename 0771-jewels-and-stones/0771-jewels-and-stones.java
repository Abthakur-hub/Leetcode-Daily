class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1){
                map.put(ch , map.getOrDefault(ch,0)+1);
            }
        }
        int sum = 0;
        
        for(Character key: map.keySet()){
            sum += map.get(key);
        }
        return sum;
    }
}