class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int num:arr){
            freq[num]++;
        }
        for(int i=500;i>0;i--){
            if(i==freq[i]){
                return i;
            }
        }
        return -1;
    }
}