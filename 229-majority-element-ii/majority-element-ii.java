import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = nums[0];
        int candidate2 = nums[0];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            }
            else if (nums[i] == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        int verified1 = 0, verified2 = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == candidate1) {
                verified1++;
            }
            else if (nums[j] == candidate2) {
                verified2++;
            }
        }
        int threshold = nums.length / 3;
        List<Integer> answer = new ArrayList<>();
        if (verified1 > threshold) {
            answer.add(candidate1);
        }
        if (candidate2 != candidate1 && verified2 > threshold) {
            answer.add(candidate2);
        }
        return answer;
    }
}