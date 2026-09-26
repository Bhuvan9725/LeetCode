class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        long closest = (long) nums[0] + nums[1] + nums[2];
        for (int fixed = 0; fixed < n - 2; fixed++) {
            int left = fixed + 1;
            int right = n - 1;
            while (left < right) {
                long sum = (long) nums[fixed]+ nums[left]+ nums[right];
                if (Math.abs(sum - target) <Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum == target) {
                    return (int) sum;
                }
                if (sum < target) {
                    left++;
                }

                // Need a smaller sum
                else {
                    right--;
                }
            }
        }
        return (int) closest;
    }
}