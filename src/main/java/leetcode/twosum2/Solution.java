package leetcode.twosum2;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int firstIndex = 0;
    int secondIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      final int number = numbers[i];
      firstIndex = i;
      final int r = Arrays.binarySearch(numbers, i + 1, numbers.length, target - number);
      if (r >= 0) {
        secondIndex = r;
        break;
      }
    }
    return new int[]{firstIndex + 1, secondIndex + 1};
  }
}
