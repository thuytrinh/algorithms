package leetcode.move0s;

/**
 * https://leetcode.com/problems/move-zeroes/description/
 * <p>
 * Approach 0: Iterate through `nums` in reverse, for each of number,
 * if it's 0, we'll swap until it reaches the zero section.
 * After that, we also have to expand the zero section to the left.
 */
public class Solution {
  public void moveZeroes(int[] nums) {
    // [0,0,1] zeroArea = 3
    // -> [0,1,0] zeroArea = 2
    // -> [1,0,0] zeroArea = 1
    int zeroArea = nums.length;
    for (int i = nums.length - 1; i >= 0; i--) {
      int num = nums[i];
      if (num == 0) {
        zeroArea = move(nums, i, zeroArea);
      }
    }
  }

  private int move(
      final int[] nums,
      final int start,
      final int zeroArea) {
    // [0,0,3,1] zeroArea = 4
    // [0,3,1,0] zeroArea = 3
    for (int i = start; i < zeroArea - 1; i++) {
      swap(nums, i);
    }
    return zeroArea - 1;
  }

  private void swap(final int[] nums, final int i) {
    int temp = nums[i];
    nums[i] = nums[i + 1];
    nums[i + 1] = temp;
  }
}
