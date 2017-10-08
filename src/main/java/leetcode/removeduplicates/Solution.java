package leetcode.removeduplicates;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * <p>
 * Approach 0: Iterate through the array. Compare nums(i) and nums(i+1).
 * If they equals, we find duplicates. Then we perform a left shift.
 * Also, we should decrease new length by 1. We stop iteration when
 * we reach the end of new length.
 * <p>
 * [1,1,2,2,3] newLen=5
 * -> [1,2,2,3,3] newLen=4
 * -> [1,2,3,3,3] newLen=3
 */
public class Solution {
  // nums: [1,1,2]
  public int removeDuplicates(int[] nums) {
    int newLen = nums.length; // newLen: 3
    for (int i = 0; i <= newLen - 2; i++) { // i: 1; newLen - 2: 0
      final int current = nums[i]; // current: 1
      final int next = nums[i + 1]; // next: 1
      if (current == next) {
        shiftLeft(nums, i + 1, newLen);
        // nums: [1,2,2]
        newLen--; // newLen: 2
        i--;
      }
    }
    return newLen;
  }

  private void shiftLeft(
      final int[] nums,
      final int start, // start: 1
      final int newLen) { // 3
    for (int i = start; i <= newLen - 2; i++) {
      // newLen - 2: 1.
      nums[i] = nums[i + 1];
    }
  }
}
