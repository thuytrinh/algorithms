package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] r = new int[2];
    Map<Integer, Integer> complementMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final Integer index = complementMap.get(nums[i]);
      if (index != null) {
        r[0] = index;
        r[1] = i;
        break;
      } else {
        complementMap.put(target - nums[i], i);
      }
    }
    return r;
  }
}
