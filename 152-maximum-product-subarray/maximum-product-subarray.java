class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int currMax=nums[0];
        int currMin=nums[0];
        int maxprod=nums[0];
        for(int i=1;i<n;i++){
            int currval=nums[i];
            int max=currMax*currval;
            int min=currMin*currval;
            currMax=Math.max(currval,Math.max(max,min));
            currMin=Math.min(currval,Math.min(max,min));
            maxprod=Math.max(maxprod,currMax);
        }
        return maxprod;
    }
}