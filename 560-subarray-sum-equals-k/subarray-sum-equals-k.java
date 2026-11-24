class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int prefsum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefsum += nums[i];
            if (mp.containsKey(prefsum - k)) {
                count += mp.get(prefsum - k);
            }
            mp.put(prefsum, mp.getOrDefault(prefsum, 0) + 1);
        }
        return count;
    }
}