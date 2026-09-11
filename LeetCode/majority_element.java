// Majority Element [Easy]
// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (int h = 0; h < nums.length; h++) {
            int j = freq.get(nums[h]);
            if (j > nums.length / 2) {
                return nums[h];
            }
        }

        return -1;
    }
}