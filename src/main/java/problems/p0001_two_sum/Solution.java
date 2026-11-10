package problems.p0001_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum (Easy)</a>
 * <P>
 * Approach: single pass with a map of value -> index; for each number, check whether its
 * complement has already been seen.
 * Time: O(n), Space: O(n)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = seen.get(target - nums[i]);
            if (j != null) {
                return new int[]{j, i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
