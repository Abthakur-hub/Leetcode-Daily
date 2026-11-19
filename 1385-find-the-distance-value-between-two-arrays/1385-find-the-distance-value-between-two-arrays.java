class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int total = 0;
        for(int i=0; i<arr1.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<arr2.length; j++){
                min = Math.min(Math.abs(arr1[i]-arr2[j]),min);
            }
            if(min>d)total++;
        }
        return total;
    }
}