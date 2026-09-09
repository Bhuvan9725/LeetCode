class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posIndex=0;
        int negIndex=1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}