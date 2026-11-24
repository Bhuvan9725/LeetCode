class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxprod=nums[0];
        for(int i=0;i<n;i++){
            int currprod=1;
            for(int j=i;j<n;j++){
                currprod*=nums[j];
                maxprod=Math.max(currprod,maxprod);
            }
        }
        return maxprod;
    }
}