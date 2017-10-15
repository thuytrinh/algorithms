package leetcode.searchrotatedsortedarray;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 */
public class Solution {
  public int search(int[] nums, int target) {
    // [1,2,3,4,5,0]
    // [2,3,4,5,0,1]
    // [3,4,5,0,1,2]
    // [4,5,0,1,2,3]
    // [0,1,2,3,4,5] -> No rotation.
    if (nums == null || nums.length == 0) {
      return -1;
    }
    if (nums.length == 1) {
      return nums[0] == target ? 0 : -1;
    }
    if (nums[0] < nums[nums.length - 1]) {
      final int r = Arrays.binarySearch(nums, target);
      return r < 0 ? -1 : r;
    } else {
      return normalSearch(nums, target);
    }
  }

  private int normalSearch(final int[] nums, final int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }
    return -1;
  }
}
